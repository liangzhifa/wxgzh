package com.zhifa.wxgzh.controller;

import com.zhifa.wxgzh.domain.WxUserEvent;
import com.zhifa.wxgzh.mapper.WxUserEventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransationController2 {

    @Autowired
    private WxUserEventMapper wxUserEventMapper;


    @GetMapping("/hello2")
    @Transactional
    public String hello() {
        WxUserEvent wxUserEvent = WxUserEvent.builder().event("hello2 event").build();
        wxUserEventMapper.insert(wxUserEvent);
        if (true) {
            throw new RuntimeException("......");
        }
        return "hello2~~~~";
    }
}
