package com.zhifa.wxgzh.controller;

import com.mxixm.fastboot.weixin.annotation.WxController;
import org.springframework.web.bind.annotation.RequestMapping;

@WxController
@RequestMapping("")
public class helloController {

    @RequestMapping("/")
    public String sayHello(){
        return "hello。。。";
    }
}
