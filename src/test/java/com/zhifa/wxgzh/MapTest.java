package com.zhifa.wxgzh;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("hi","44");
        System.out.println(map.get("hi"));
        System.out.println(map.get("hi")==null||(map.get("hi")!=null&&map.get("hi").equals("44")));
    }
}
