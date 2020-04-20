package com.zhifa.wxgzh.controller.weixin.event;

import com.baidu.aip.ocr.AipOcr;
import com.mxixm.fastboot.weixin.annotation.WxAsyncMessage;
import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.annotation.WxMessageMapping;
import com.mxixm.fastboot.weixin.module.message.WxMessage;
import com.mxixm.fastboot.weixin.module.message.WxUserMessage;
import com.mxixm.fastboot.weixin.module.web.WxRequest;
import com.mxixm.fastboot.weixin.module.web.WxRequestBody;
import com.zhifa.wxgzh.aliyun.AliyunClientCoonfig;
import com.zhifa.wxgzh.aliyun.AliyunImageResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import java.util.concurrent.atomic.AtomicReference;

@WxController
@Slf4j
public class WxImageController {

    @Autowired
    private AipOcr aipOcr;

    /**
     * 接受用户图片消息，异步返回文本消息
     *
     * @param
     * @return the result
     */
    @WxMessageMapping(type = WxMessage.Type.IMAGE)
    @WxAsyncMessage
    public String image(WxRequest wxRequest, WxRequestBody.Image image, String content) {
        WxRequest.Body body = wxRequest.getBody();
        String picUrl = image.getPicUrl();
        String openId = wxRequest.getOpenId();
        log.info("调用了image WxMessage.Type.IMAGE => openId={}  getPicUrl={}", openId, picUrl);
        WxMessage.ImageBuilder imageBuilder = WxMessage.imageBuilder();
        WxUserMessage build = imageBuilder.mediaUrl(picUrl).build();
        // 通用文字识别, 图片参数为远程url图片
        String res = aipOcr.basicGeneralUrl(picUrl, AliyunClientCoonfig.getOptions()).toString();
        AliyunImageResult aliyunImageResult = com.alibaba.fastjson.JSONObject.parseObject(res, AliyunImageResult.class);
        //System.out.println(aliyunImageResult);
        AtomicReference<String> imgResult = new AtomicReference<>("");
        if (!ObjectUtils.isEmpty(aliyunImageResult)&&
                !ObjectUtils.isEmpty(aliyunImageResult.getWords_result())&&
                aliyunImageResult.getWords_result().size()>0) {
            aliyunImageResult.getWords_result().forEach(wordsResultBean -> {
                //System.out.println(wordsResultBean.getWords());
                imgResult.set(imgResult+"\n" + wordsResultBean.getWords());
            });
        }

        return imgResult.get();
    }



}
