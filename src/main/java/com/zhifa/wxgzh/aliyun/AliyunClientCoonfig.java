package com.zhifa.wxgzh.aliyun;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class AliyunClientCoonfig {
    //设置APPID/AK/SK
    public static final String APP_ID = "15972144";
    public static final String API_KEY = "vNHEn1CRpBVk1RGmsww5zhKS";
    public static final String SECRET_KEY = "8eUyawQ7G1Zz6uqEiAYgt4xUWhvnPuRf";
    public static final HashMap<String, String> options = new HashMap<String, String>();

    public static HashMap<String, String> getOptions(){
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "true");
        return options;
    }

    @Bean
    public AipOcr aipOcr(){
        return new AipOcr(APP_ID, API_KEY, SECRET_KEY);
    }

    public static void main(String[] args) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "true");

        //String url = "https://dss2.bdstatic.com/8_V1bjqh_Q23odCf/pacific/1947821317.jpg";
        String url = "https://img-blog.csdnimg.cn/20200309112223556.png#pic_center";
        // 通用文字识别, 图片参数为远程url图片
        String res = new AipOcr(APP_ID, API_KEY, SECRET_KEY).basicGeneralUrl(url, options).toString();
        AliyunImageResult aliyunImageResult = com.alibaba.fastjson.JSONObject.parseObject(res, AliyunImageResult.class);
        //System.out.println(aliyunImageResult);
        aliyunImageResult.getWords_result().forEach(wordsResultBean -> {
            System.out.println(wordsResultBean.getWords());
        });
    }

}
