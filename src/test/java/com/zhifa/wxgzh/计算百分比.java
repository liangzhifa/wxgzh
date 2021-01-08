package com.zhifa.wxgzh;
import java.util.Date;
import java.util.ArrayList;

import com.mxixm.fastboot.weixin.module.user.WxUser;

import java.text.NumberFormat;

public class 计算百分比 {
    public static void main(String[] args) {
        Double num1 = 9.2D;
        Double num2 = 9D;
        // 创建一个数值格式化对象
        NumberFormat numberFormat = NumberFormat.getInstance();
        // 设置精确到小数点后2位
        numberFormat.setMaximumFractionDigits(2);
        String result = numberFormat.format( num1 /  num2 * 100);
        System.out.println("num1和num2的百分比为:" + result + "%");
        WxUser user = new WxUser();

    }



}
