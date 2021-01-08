package com.zhifa.wxgzh.controller.bilibili;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;
import com.zhifa.wxgzh.constant.BiliConstant;
import com.zhifa.wxgzh.domain.BLoginInfo;
import com.zhifa.wxgzh.domain.BLoginUrl;
import com.zhifa.wxgzh.dto.*;
import com.zhifa.wxgzh.service.BLoginInfoService;
import com.zhifa.wxgzh.service.BLoginUrlService;
import com.zhifa.wxgzh.util.BilibiliApiUtil;
import com.zhifa.wxgzh.util.HttpUtil;
import com.zhifa.wxgzh.util.QRCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bilibili")
public class BiliController {

    @Autowired
    private BLoginUrlService bLoginUrlService;

    @Autowired
    private BLoginInfoService bLoginInfoService;

    @GetMapping("/loginCode")
    public void loginCode(HttpServletResponse response) throws Exception {
        String s = BilibiliApiUtil.sendHttpGet(BiliConstant.getLoginUrl, null);
        BiliLoginUrlDto biliLoginUrlDto = JSONObject.parseObject(s, BiliLoginUrlDto.class);
        BLoginUrl bLoginUrl = new BLoginUrl();
        bLoginUrl.setCode(biliLoginUrlDto.getCode());
        bLoginUrl.setTs(biliLoginUrlDto.getTs());
        bLoginUrl.setUrl(biliLoginUrlDto.getData().getUrl());
        bLoginUrl.setOauthkey(biliLoginUrlDto.getData().getOauthKey());
        boolean save = bLoginUrlService.save(bLoginUrl);

        BufferedImage image = QRCodeUtil.createImage(biliLoginUrlDto.getData().getUrl(), null, true);
        // 写入返回
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", baos);
        byte[] QRJPG = baos.toByteArray();
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        ServletOutputStream os = response.getOutputStream();
        os.write(QRJPG); // 自此完成一套，图片读入，写入流，转为字节数组，写入输出流
        os.flush();
        os.close();
        baos.close();
    }


    @GetMapping("/loginInfo")
    public BLoginInfo loginInfo(String oauthKey) throws Exception {

        String s = BilibiliApiUtil.sendHttpPost(BiliConstant.getLoginInfo(oauthKey), null, null);
        BiliLoginUserInfoDto biliLoginUserInfoDto = JSONObject.parseObject(s, BiliLoginUserInfoDto.class);
        BLoginInfo bLoginInfo = new BLoginInfo();
        bLoginInfo.setTs(biliLoginUserInfoDto.getTs());
        bLoginInfo.setUrl(biliLoginUserInfoDto.getData().getUrl());
        Map<String, String> paramMap = HttpUtil.urlSplit(biliLoginUserInfoDto.getData().getUrl());

        bLoginInfo.setDedeuserid(paramMap.get("dedeuserid"));
        bLoginInfo.setDedeuseridCkmd5(paramMap.get("dedeuserid__ckmd5"));
        bLoginInfo.setExpires(paramMap.get("expires"));
        bLoginInfo.setSessdata(paramMap.get("sessdata"));
        bLoginInfo.setBiliJct(paramMap.get("bili_jct"));
        bLoginInfo.setGourl(paramMap.get("gourl"));

        boolean save = bLoginInfoService.save(bLoginInfo);

        return bLoginInfo;

    }

    @GetMapping("/bilibiliTasks")
    public String bilibiliTasks() throws Exception {
        List<String> strings = new ArrayList<>();

        strings.add("运行开始时间:" + new Date());
        strings.add("---开始【登录】---");

        String loginPath = "http://api.bilibili.com/x/web-interface/nav";//投币
        String SESSDATA = "9e31eb4f%2c1625646875%2cbac50%2a11";
        String csrf = "a84ab9480ea3d1c6711407947db34d9b";//bili_jct
        String cookie = "SESSDATA=" + SESSDATA + ";";
        String s = BilibiliApiUtil.sendHttpGet(loginPath, cookie);

        LoginData loginData = BilibiliApiUtil.login(SESSDATA);
        Level level = loginData.getLevel_info();
        strings.add("登录成功，用户名: "+loginData.getUname());
        strings.add("硬币余额: "+loginData.getMoney());
        strings.add("当前等级: "+level.getCurrent_level());

        List<VideoList> videoDataListPlay = BilibiliApiUtil.video(SESSDATA,1);

        VideoList videoDataPlay = videoDataListPlay.get(0);
        strings.add("---结束【登录】---");
        strings.add("");
        strings.add("---开始【观看&分享视频】---");
        strings.add("获取随机视频:《"+videoDataPlay.getTitle()+"》");
        strings.add("---开始观看视频---");
        BilibiliApiUtil.videoPlay(SESSDATA,videoDataPlay.getBvid());
        strings.add("---视频观看完毕---");
        strings.add("---开始分享视频---");
        BilibiliApiUtil.videoShare(csrf,SESSDATA,videoDataPlay.getBvid());
        strings.add("---开始分享完毕---");
        strings.add("");
        strings.add("---开始【投币】---");
        if(loginData.getMoney()>0){

            ToubiVerification toubiVerification = BilibiliApiUtil.toubiVerification(SESSDATA);
            if(toubiVerification.getData()==50){
                strings.add("---今日已投5枚硬币,再投也不会有经验啦!!---");
            }else{
                List<VideoList> videoDataList = BilibiliApiUtil.video(SESSDATA,50);
                for(int i=0;i<5;i++){
                    VideoList videoData = videoDataList.get(i);
                    boolean flag = BilibiliApiUtil.verificationVideo(SESSDATA,videoData.getBvid());
                    if(flag){
                        BilibiliApiUtil.toubi(SESSDATA,csrf,videoData.getBvid());
                        strings.add("为《"+videoData.getTitle()+"》投币成功");
                    }else{
                        i--;
                    }
                }
            }
        }else{
            strings.add("---投币结束,原因:硬币余额不足!---");
        }
        strings.add("---结束【投币】---");
        strings.add("---开始【直播中心签到】---");
        Sign sign = BilibiliApiUtil.sign(SESSDATA);
        if(sign.getMessage().equals("0")){
            strings.add("直播中心签到成功!");
        }else{
            strings.add(sign.getMessage());
        }
        strings.add("---结束【直播中心签到】---");
        strings.add("");
        strings.add("");
        strings.add("---全部任务已完成---");
        String json = JSONUtil.toJsonStr(strings);
        return json;

    }
}
