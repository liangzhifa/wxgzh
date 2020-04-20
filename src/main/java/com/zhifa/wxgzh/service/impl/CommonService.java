package com.zhifa.wxgzh.service.impl;

import com.mxixm.fastboot.weixin.module.user.WxUser;
import com.zhifa.wxgzh.domain.WxUserEvent;
import com.zhifa.wxgzh.service.WxUserEventService;
import com.zhifa.wxgzh.service.WxUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Slf4j
public class CommonService {

    @Autowired
    private WxUserEventService wxUserEventService;
    @Async
    public void saveUserInfo(WxUser wxUser, String event) {
        Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        System.out.println(sdf.format(date));
        wxUserEventService.save(
                WxUserEvent.builder()
                        .event(event)
                        .openId(wxUser.getOpenId())
                        .createTime(date)
                        .build());
        log.info("微信事件访问：{}",wxUser);
    }

}
