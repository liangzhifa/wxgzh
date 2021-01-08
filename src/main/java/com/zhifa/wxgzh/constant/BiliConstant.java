package com.zhifa.wxgzh.constant;

public class BiliConstant {
    public static final String getLoginUrl = "http://passport.bilibili.com/qrcode/getLoginUrl";//获取二维码登录地址

    public static String getLoginInfo(String oauthKey) {
        return "http://passport.bilibili.com/qrcode/getLoginInfo?oauthKey=" + oauthKey;// 获取登录信息
    }

    public static final String loginPath = "http://api.bilibili.com/x/web-interface/nav";//登录


}
