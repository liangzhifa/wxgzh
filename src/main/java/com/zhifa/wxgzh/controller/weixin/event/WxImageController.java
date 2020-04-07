package com.zhifa.wxgzh.controller.weixin.event;

import com.mxixm.fastboot.weixin.annotation.WxAsyncMessage;
import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.annotation.WxMessageMapping;
import com.mxixm.fastboot.weixin.module.message.WxMessage;
import com.mxixm.fastboot.weixin.module.message.WxUserMessage;
import com.mxixm.fastboot.weixin.module.web.WxRequest;
import com.mxixm.fastboot.weixin.module.web.WxRequestBody;
import lombok.extern.slf4j.Slf4j;

@WxController
@Slf4j
public class WxImageController {

    /**
     * 接受用户图片消息，异步返回文本消息
     *
     * @param
     * @return the result
     */
    @WxMessageMapping(type = WxMessage.Type.IMAGE)
    @WxAsyncMessage
    public WxUserMessage image(WxRequest wxRequest, WxRequestBody.Image image, String content) {
        WxRequest.Body body = wxRequest.getBody();
        String picUrl = image.getPicUrl();
        String openId = wxRequest.getOpenId();
        log.info("调用了image WxMessage.Type.IMAGE => openId={}  getPicUrl={}", openId, picUrl);
        WxMessage.ImageBuilder imageBuilder = WxMessage.imageBuilder();
        WxUserMessage build = imageBuilder.mediaUrl(picUrl).build();
        return build;
    }



}
