package com.zhifa.wxgzh;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * @auther liangzf
 * @date 2021/5/7 上午9:48
 * 描述信息：
 */
public class MultiValueMapTest {
    public static void main(String[] args) {
        // 实例化
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        // 为name放入3个值
        params.add("name", "Name参数1");
        params.add("name", "Name参数2");
        params.add("name", "Name参数3");
        // 打印第三个参数
        System.out.println(params.get("name").get(2));
        // 放入id一个idList
        List<String> idList = new ArrayList();
        idList.add(UUID.randomUUID().toString().replaceAll("-", ""));
        idList.add(UUID.randomUUID().toString().replaceAll("-", ""));
        idList.add(UUID.randomUUID().toString().replaceAll("-", ""));
        params.put("id", idList);
        // 打印第三个参数
        System.out.println(params.get("id").get(2));
        // 打印所有值
        Set<String> keySet = params.keySet();
        for (String key : keySet) {
            List<String> values = ((LinkedMultiValueMap<String, String>) params).get(key);
            for (String value : values) {
                System.out.println(key + ": " + value);
            }
        }
    }
}
