package com.zhifa.wxgzh;

import java.math.BigDecimal;

public class MapTest {
    /*保留两位小数的除法操作*/
    public static double divide(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double divide(double v1, double v2, int scale, int mutil) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(mutil)).doubleValue();
    }

    public static void main(String[] args) {
       /* Map<String, Object> map = new HashMap<>();
        map.put("hi","44");
        System.out.println(map.get("hi"));
        System.out.println(map.get("hi")==null||(map.get("hi")!=null&&map.get("hi").equals("44")));*/
       /* BigDecimal bigNum1 = new BigDecimal(12.232 + "");
        BigDecimal bigNum2 = new BigDecimal(10.452 + "");
        BigDecimal subtract = bigNum1.subtract(bigNum2);
        if (subtract.doubleValue() > 0) {
            System.out.println(subtract.doubleValue());;
        }
        List<WxUserInfo> list = new LinkedList<>();
        list.add(new WxUserInfo());*/
        //System.out.println(divide(1297.2925,2559.471,4));
        //System.out.println(divide(1297.2925,2559.471,4,100));


    }


}
