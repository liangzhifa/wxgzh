package com.zhifa.wxgzh;

import com.mxixm.fastboot.weixin.annotation.EnableWxMvc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.zhifa.wxgzh.mapper")
@EnableWxMvc
@EnableAsync //开启异步调用
@EnableScheduling
@EnableTransactionManagement
public class WxgzhApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxgzhApplication.class, args);
    }

}
