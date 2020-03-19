package com.zhifa.wxgzh.controller.weixin.menu;

import com.mxixm.fastboot.weixin.annotation.WxAsyncMessage;
import com.mxixm.fastboot.weixin.annotation.WxButton;
import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.module.web.WxRequest;


@WxController
public class WxMenuController {


    /**
     * 定义微信菜单
     */
    @WxButton(group = WxButton.Group.LEFT, main = true, name = "学生信息")
    public void left() {
    }

    /**
     * 学生相关
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.FIRST,
            url = "/wx/main",
            name = "成绩相关")
    @WxAsyncMessage
    public void link(WxRequest wxRequest) {
    }

    /**
     * 学生相关
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.SECOND,
            url = "/wx/txl",
            name = "通讯录")
    @WxAsyncMessage
    public void class_info(WxRequest wxRequest) {
    }

    /**
     * 学生相关
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.THIRD,
            url = "/wx/liuyan",
            name = "留言信息")
    @WxAsyncMessage
    public void liuyan(WxRequest wxRequest) {
    }



    /**
     * 定义微信菜单
     */
    @WxButton(group = WxButton.Group.MIDDLE, main = true, name = "学习工具")
    public void center() {
    }

    /**图像识别
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.PIC_PHOTO_OR_ALBUM,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.FIRST,
            name = "拍照翻译")
    @WxAsyncMessage
    public void PIC_PHOTO_OR_ALBUM(WxRequest wxRequest) {
        //  WxRequest.Body body = wxRequest.getBody();

    }



    @WxButton(type =WxButton.Type.VIEW,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.SECOND,
            url = "https://fanyi.baidu.com/?aldtype=16047#auto/zh",
            name="翻译工具")
    @WxAsyncMessage
    public void youdaofanyi(WxRequest wxRequest){
    }

    @WxButton(type =WxButton.Type.VIEW,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.THIRD,
            url = "https://chengyu.911cha.com/",
            name="成语词典")
    @WxAsyncMessage
    public void chengyuzidian(WxRequest wxRequest){
    }



    @WxButton(type =WxButton.Type.VIEW,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.FORTH,
            url = "https://m.gushiwen.org/",
            name="古诗文")
    @WxAsyncMessage
    public void gushiwen(WxRequest wxRequest){
    }


    /**
     * 定义微信菜单
     */
    @WxButton(group = WxButton.Group.RIGHT, main = true, name = "考试咨询")
    public void right() {
    }


    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.RIGHT,
            order = WxButton.Order.FIRST,
            url = "http://www.gdou.edu.cn/",
            name = "教务处")
    @WxAsyncMessage
    public void guanwang(WxRequest wxRequest) {
    }

    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.RIGHT,
            order = WxButton.Order.SECOND,
            url = "http://m.gaosan.com/guangdonggaokao/",
            name = "高考")
    @WxAsyncMessage
    public void gaokao(WxRequest wxRequest) {
    }

    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.RIGHT,
            order = WxButton.Order.THIRD,
            url = "http://gz.zhongkao.com/",
            name = "中考")
    @WxAsyncMessage
    public void zhongkao(WxRequest wxRequest) {
    }

    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.RIGHT,
            order = WxButton.Order.FORTH,
            url = "https://www.chsi.com.cn/",
            name = "学信网")
    @WxAsyncMessage
    public void xuexinwang(WxRequest wxRequest) {
    }


}
