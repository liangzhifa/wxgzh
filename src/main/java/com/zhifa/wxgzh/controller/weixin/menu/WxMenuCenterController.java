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
public class WxMenuCenterController {


    @Autowired
    private CommonService commonService;
    /**
     * 定义微信菜单
     */
    @WxButton(group = WxButton.Group.MIDDLE, main = true, name = "常用工具")
    public void center() {
    }

    /**
     * 图像识别
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.PIC_PHOTO_OR_ALBUM,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.FIRST,
            name = "照片提取文字")
    @WxAsyncMessage
    public void PIC_PHOTO_OR_ALBUM(WxRequest wxRequest, WxUser wxUser) {
        //  WxRequest.Body body = wxRequest.getBody();
        commonService.saveUserInfo(wxUser, CommonConstant.CLICK_Photo_VIEW);

    }


/*    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.SECOND,
            url = "https://fanyi.baidu.com/?aldtype=16047#auto/zh",
            name = "百度翻译")
    @WxAsyncMessage
    public void youdaofanyi(WxRequest wxRequest) {
    }*/

    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.SECOND,
            url = "https://www.iamwawa.cn/",
            name = "便捷在线工具")
    @WxAsyncMessage
    public void wawagongju(WxRequest wxRequest,WxUser wxUser) {
        commonService.saveUserInfo(wxUser, CommonConstant.CLICK_Tools_VIEW);
    }

    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.THIRD,
            url = "http://www.dxzy163.com/",
            name = "大学资源网")
    @WxAsyncMessage
    public void dxzy163(WxRequest wxRequest,WxUser wxUser) {
        commonService.saveUserInfo(wxUser, CommonConstant.CLICK_College_VIEW);
    }
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.FORTH,
            url = "http://www.bewindoweb.com/dwg.php",
            name = "各大网站书签")
    @WxAsyncMessage
    public void bewindoweb(WxRequest wxRequest,WxUser wxUser) {
        commonService.saveUserInfo(wxUser, CommonConstant.CLICK_Bookmark_VIEW);
    }

    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.FIFTH,
            url = "https://cn.office-converter.com/",
            name = "格式转换大全")
    @WxAsyncMessage
    public void office(WxRequest wxRequest,WxUser wxUser) {
        commonService.saveUserInfo(wxUser, CommonConstant.CLICK_Format_Change_VIEW);
    }


}
