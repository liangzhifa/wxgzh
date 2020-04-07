package com.zhifa.wxgzh.controller.weixin.menu;

import com.mxixm.fastboot.weixin.annotation.WxAsyncMessage;
import com.mxixm.fastboot.weixin.annotation.WxButton;
import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.module.message.WxMessage;
import com.mxixm.fastboot.weixin.module.message.WxUserMessage;
import com.mxixm.fastboot.weixin.module.user.WxUser;
import com.mxixm.fastboot.weixin.module.web.WxRequest;
import com.zhifa.wxgzh.common.CommonConstant;
import com.zhifa.wxgzh.domain.WxUserEvent;
import com.zhifa.wxgzh.service.WxUserEventService;
import com.zhifa.wxgzh.service.WxUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


@WxController
@Slf4j
public class WxMenuLeftController {


    @Autowired
    private WxUserInfoService wxUserInfoService;

    @Autowired
    private WxUserEventService wxUserEventService;


    /**
     * 定义微信菜单
     */
    @WxButton(group = WxButton.Group.LEFT, main = true, name = "关于我")
    public void left() {
    }

    /**
     * 定义微信菜单，并接受事件
     * @return
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.FIRST,
            url = "http://www.zhifa.tech",
            name= "个人简历")
    @WxAsyncMessage
    public void leftmySelf(WxRequest wxRequest, WxUser wxUser) {
        Date date = new Date();
        wxUserEventService.save(
                WxUserEvent.builder()
                        .event(CommonConstant.CLICK_CSDN_VIEW)
                        .openId(wxUser.getOpenId())
                        .createTime(date)
                        .build());
        log.info("个人简历：{}",wxUser);
       /* return WxMessage.newsBuilder()
                .addItem("测试图文消息",
                        "测试",
                        "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/logo_white.png",
                        "http://zhifa.free.idcfengye.com/")
                .build();*/
    }
    /**
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.SECOND,
            url = "https://mp.csdn.net/console/article",
            name= "CSDN博客")
    public void leftCSDN(WxRequest wxRequest, WxUser wxUser) {
        wxUserEventService.save(
                WxUserEvent.builder()
                        .event(CommonConstant.CLICK_CSDN_VIEW)
                        .openId(wxUser.getOpenId())
                        .createTime(new Date())
                        .build());
        log.info("CSDN博客：{}",wxUser);
    }
    /**
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.THIRD,
            url = "https://github.com/liangzhifa",
            name= "GitHub仓库")
    public void leftGitHub(WxRequest wxRequest, WxUser wxUser) {
        wxUserEventService.save(
                WxUserEvent.builder()
                        .event(CommonConstant.CLICK_GitHub_VIEW)
                        .openId(wxUser.getOpenId())
                        .createTime(new Date())
                        .build());
        log.info("GitHub：{}",wxUser);
    }
 /**
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.FORTH,
            url = "https://gitee.com/xiaozhiZhiShui",
            name= "码云仓库")
    public void leftgitee(WxRequest wxRequest, WxUser wxUser) {
        wxUserEventService.save(
                WxUserEvent.builder()
                        .event(CommonConstant.CLICK_GitHub_VIEW)
                        .openId(wxUser.getOpenId())
                        .createTime(new Date())
                        .build());
        log.info("gitee：{}",wxUser);
    }

}
