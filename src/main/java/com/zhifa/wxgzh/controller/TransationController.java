package com.zhifa.wxgzh.controller;

import com.zhifa.wxgzh.domain.WxUserEvent;
import com.zhifa.wxgzh.mapper.WxUserEventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class TransationController {

    @Autowired
    private WxUserEventMapper wxUserEventMapper;

    @GetMapping("/hi")
    public String hi() {
        WxUserEvent wxUserEvent = WxUserEvent.builder().event("hi event").build();
        wxUserEventMapper.insert(wxUserEvent);
        return "hi~~~~";
    }

    @GetMapping("/hihi")
    public String hihi() {
        WxUserEvent wxUserEvent = WxUserEvent.builder().event("hihi event").build();
        wxUserEventMapper.insert(wxUserEvent);
        if (true) {
            throw new RuntimeException("......");
        }
        return "hello~~~~";
    }

    @GetMapping("/hello")
    @Transactional
    public String hello() {
        WxUserEvent wxUserEvent = WxUserEvent.builder().event("hello event").build();
        wxUserEventMapper.insert(wxUserEvent);
        if (true) {
            throw new RuntimeException("......");
        }
        return "hello~~~~";
    }
}
