package com.zhifa.wxgzh.util;

import java.io.File;

public class LocalFileUtil {
    public static String getUserHome(){
        String fileSeperator = System.getProperty("file.separator");
        String userHome = "/usr/local"+fileSeperator+"dongmanImgs"+fileSeperator;
        File file = new File(userHome);
        if (!file.exists()&&file.mkdir()) {
            file.mkdir();
        }
        return userHome;
    }
}
