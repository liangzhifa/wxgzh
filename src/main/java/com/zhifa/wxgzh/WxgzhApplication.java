package com.zhifa.wxgzh;

import com.mxixm.fastboot.weixin.annotation.EnableWxMvc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhifa.wxgzh.mapper")
@EnableWxMvc
public class WxgzhApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxgzhApplication.class, args);
    }

}
