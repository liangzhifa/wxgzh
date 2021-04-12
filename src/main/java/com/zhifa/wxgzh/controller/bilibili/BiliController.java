package com.zhifa.wxgzh.controller.bilibili;

import com.alibaba.fastjson.JSONObject;
import com.zhifa.wxgzh.constant.BiliConstant;
import com.zhifa.wxgzh.domain.BLog;
import com.zhifa.wxgzh.domain.BLoginInfo;
import com.zhifa.wxgzh.domain.BLoginUrl;
import com.zhifa.wxgzh.dto.BiliLoginUrlDto;
import com.zhifa.wxgzh.dto.BiliLoginUserInfoDto;
import com.zhifa.wxgzh.scheduled.BiliScheduled;
import com.zhifa.wxgzh.service.BLogService;
import com.zhifa.wxgzh.service.BLoginInfoService;
import com.zhifa.wxgzh.service.BLoginUrlService;
import com.zhifa.wxgzh.util.BilibiliApiUtil;
import com.zhifa.wxgzh.util.HttpUtil;
import com.zhifa.wxgzh.util.QRCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bilibili")
public class BiliController {

    @Autowired
    private BLoginUrlService bLoginUrlService;

    @Autowired
    private BLoginInfoService bLoginInfoService;

    @Autowired
    private BLogService bLogService;

    @Autowired
    private BiliScheduled biliScheduled;

    @GetMapping("/loginCode")
    public void loginCode(HttpServletResponse response) throws Exception {
        String s = BilibiliApiUtil.sendHttpGet(BiliConstant.getLoginUrl, null);
        BiliLoginUrlDto biliLoginUrlDto = JSONObject.parseObject(s, BiliLoginUrlDto.class);
        BLoginUrl bLoginUrl = new BLoginUrl();
        bLoginUrl.setCode(biliLoginUrlDto.getCode());
        bLoginUrl.setTs(biliLoginUrlDto.getTs());
        bLoginUrl.setUrl(biliLoginUrlDto.getData().getUrl());
        bLoginUrl.setOauthkey(biliLoginUrlDto.getData().getOauthKey());
        bLoginUrl.setStatus(BiliConstant.LOGIN_CREATE);
        bLoginUrl.setStatusTimes(1);
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


        return bLogService.loginByOauthKey(oauthKey);

    }

    @GetMapping("/getBilibiliTasks")
    public List<BLog> bilibiliTasks() throws Exception {
        return bLogService.getList();/**/
    }
    @GetMapping("/getBilibiliTasks/{uId}")
    public List<BLog> bilibiliTasksWithUid(@PathVariable("uId") String uId) throws Exception {
        return bLogService.getList(uId);/**/
    }


    @GetMapping("/hand")
    public List<BLog> onHand() throws Exception {
        biliScheduled.excuteMultiTask();
        return bLogService.getList();/**/
    }

}
