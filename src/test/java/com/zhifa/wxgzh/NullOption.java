package com.zhifa.wxgzh;

import com.zhifa.wxgzh.domain.WxUserInfo;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

import static java.util.Optional.ofNullable;

/**
 * @auther liangzf
 * @date 2021/5/6 上午9:47
 * 描述信息：
 */
@Slf4j
public class NullOption {
    public static void main(String[] args) {
        WxUserInfo wxUserInfo =new WxUserInfo();
        String s = ofNullable(wxUserInfo).map(WxUserInfo::getCity).orElseGet(()->"66");
        System.out.println(s);
        WxUserInfo info1 = Optional.ofNullable(wxUserInfo).orElse(new WxUserInfo());
        log.warn("=========================");
        WxUserInfo info2 = Optional.ofNullable(wxUserInfo).orElseGet(WxUserInfo::new);
        System.out.println(info1==wxUserInfo);
        System.out.println(info1==info2);


    }
}
