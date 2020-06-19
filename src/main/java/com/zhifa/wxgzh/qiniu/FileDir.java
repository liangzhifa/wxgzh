package com.zhifa.wxgzh.qiniu;


import java.io.File;

public class FileDir {
    public static void main(String[] args) {

// 分隔符
        String fileSeperator = System.getProperty("file.separator");
        String userHome = System.getProperties().getProperty("user.home")+fileSeperator+"dongmanImgs";
        File file = new File(userHome);
        if (!file.exists()&&file.mkdir()) {
            file.mkdir();
        }
        System.out.println(fileSeperator);
        System.out.println(userHome);
    }
}
