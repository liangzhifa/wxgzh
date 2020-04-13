package com.zhifa.wxgzh.scheduling;

import com.zhifa.wxgzh.mapper.WxUserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class JDBCScheduling {

    @Autowired
    private WxUserInfoMapper wxUserInfoMapper;
    //3.添加定时任务
    @Scheduled(cron = "0/50 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {
        wxUserInfoMapper.getTiming();
    }
}
