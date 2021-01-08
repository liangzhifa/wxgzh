package com.zhifa.wxgzh;

import com.zhifa.wxgzh.domain.WxUserInfo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class 测试内存 {
    public static void main(String[] args) {
      /*  ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            executorService.execute(()->{
                while (true) {
                    long a[] = new long[finalI];
                    System.out.println(a+"==>"+finalI);
                }

            });
        }
        */

        //executorService.shutdown();

        WxUserInfo wxUserInfo = new WxUserInfo();
        Long i = 1l;
        wxUserInfo.setId(i);
        System.out.println(wxUserInfo);
        WxUserInfo wxUserInfo2 = new WxUserInfo();
        wxUserInfo2.setId(i++);
        System.out.println(wxUserInfo2);
        System.out.println(i);
    }
}
