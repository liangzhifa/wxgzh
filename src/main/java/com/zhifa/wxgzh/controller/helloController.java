package com.zhifa.wxgzh.controller;

import com.mxixm.fastboot.weixin.annotation.WxController;
import com.zhifa.wxgzh.domain.WxUserInfo;
import com.zhifa.wxgzh.service.WxUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@WxController
@RequestMapping("")
public class helloController {


    @Autowired
    private WxUserInfoService wxUserInfoService;

   /* @RequestMapping("/")
    public List<WxUserInfo> sayHello(){
        List<WxUserInfo> list = wxUserInfoService.list();
        return list;
    }*/
}
