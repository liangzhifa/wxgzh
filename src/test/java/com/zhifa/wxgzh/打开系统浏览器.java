package com.zhifa.wxgzh;

import java.io.IOException;
import java.net.URLEncoder;

public class 打开系统浏览器 {
    public static void main(String[] args) throws IOException {
        //url链接地址
        String localpath = "http://www.baidu.com/s?tn=ichuner&lm=-1&word=" +
                URLEncoder.encode("江苏省会", "gb2312") + "&rn=1";
        //获得系统类型
        String osName = System.getProperty("os.name", "");
        System.out.println(osName);
        if (osName.startsWith("Windows")) {    //如果是windows系统
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + localpath);    //打开浏览器
        }
    }
}
