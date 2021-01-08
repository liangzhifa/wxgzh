package com.zhifa.wxgzh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;

@SpringBootTest
class WxgzhApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        String[] activeProfiles = applicationContext.getEnvironment().getActiveProfiles();
        System.out.println(activeProfiles);

    }

}
