package com.zhifa.wxgzh.controller.weixin.menu;

import com.mxixm.fastboot.weixin.annotation.WxAsyncMessage;
import com.mxixm.fastboot.weixin.annotation.WxButton;
import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.module.user.WxUser;
import com.mxixm.fastboot.weixin.module.web.WxRequest;
import com.zhifa.wxgzh.common.CommonConstant;
import com.zhifa.wxgzh.service.impl.CommonService;
import org.springframework.beans.factory.annotation.Autowired;


@WxController
public class WxMenuRightController {
    @Autowired
    private CommonService commonService;
    /**
     * 定义微信菜单
     */
    @WxButton(group = WxButton.Group.RIGHT, main = true, name = "疫情咨询")
    public void right() {
    }


    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.RIGHT,
            order = WxButton.Order.FIRST,
            url = "https://voice.baidu.com/act/newpneumonia/newpneumonia/",
            name = "百度疫情信息")
    @WxAsyncMessage
    public void guanwang(WxRequest wxRequest, WxUser wxUser) {
        commonService.saveUserInfo(wxUser, CommonConstant.CLICK_Epidemic_VIEW);
    }

}
