package com.zhifa.wxgzh.scheduled;

import cn.hutool.json.JSONUtil;
import com.zhifa.wxgzh.domain.BLog;
import com.zhifa.wxgzh.dto.*;
import com.zhifa.wxgzh.service.BLogService;
import com.zhifa.wxgzh.util.BilibiliApiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BiliScheduled {
    @Autowired
    private BLogService bLogService;
    //每日18点01分触发
    @Scheduled(cron="0 1 18 * * ? *")
    public void bilibiliTasks() throws Exception {
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
        BLog bLog = new BLog();
        bLog.setResult(json);
        bLog.setCreateTime(new Date());
        bLogService.save(bLog);
    }
}
