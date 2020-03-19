package com.zhifa.wxgzh.controller.weixin.event;

import com.mxixm.fastboot.weixin.annotation.WxAsyncMessage;
import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.annotation.WxMessageMapping;
import com.mxixm.fastboot.weixin.module.message.WxMessage;
import com.mxixm.fastboot.weixin.module.message.WxMessageBody;
import com.mxixm.fastboot.weixin.module.message.WxUserMessage;
import com.mxixm.fastboot.weixin.module.web.WxRequest;
import lombok.extern.slf4j.Slf4j;

@WxController
@Slf4j
public class WxTextController {


    @WxMessageMapping(type = WxMessage.Type.TEXT, wildcard = "**")
    @WxAsyncMessage
    public WxUserMessage text(WxRequest wxRequest, String content) {
        log.info("调用了 text WxMessage.Type.TEXT wxRequest==>{}", wxRequest);
        WxUserMessage build = null;

        build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("百度一下").description("点击查看")
                        .picUrl("http://mmbiz.qpic.cn/mmbiz_jpg/BXa2ick0Zc8nTCVWh6DFJic6baxwqLiazWaSxRkXkWZmVvic5Z0I9yEcPvZjcYesd8d41ZiaZ7oAcV0vW6W4qPRn5icQ/0")
                        .url("www.baidu.com").build())
                .build();

        return build;

    }




























/*
switch (content) {
            case "1":
                build = build1();
                break;
            case "2":
                build = build2();
                break;
            case "3":
                build = build3();
                break;
            case "4":
                build = build4();
                break;
            case "5":
                build = build5();
                break;
            case "6":
                build = build6();
                break;
            case "7":
                build = build7();
                break;
            case "8":
                build = build8();
                break;
            case "9":
                build = build9();
                break;
            case "10":
                build = build10();
                break;
            case "11":
                build = build11();
                break;
            default:
                build = moren();
        }
    private WxUserMessage moren() {
        return WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("成绩").description("点击查看")
                        .picUrl("http://mmbiz.qpic.cn/mmbiz_jpg/BXa2ick0Zc8mhZBGSicbe5xd8q1vbESAWOjjOKw4icggiaZlIUP0Woj8FibWHp8yeVLvCJbwg46BfQLCPUlf8WeCib4g/0")
                        .url("/wx/main").build())
                .build();
    }

    private WxUserMessage build1() {
        WxUserMessage build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("小学学科网").description("点击查看")
                        .picUrl("http://www.xuekeedu.com/img/v3/logo_xxxk.png")
                        .url("http://www.xuekeedu.com/").build())
                .build();
        return build;
    }

    private WxUserMessage build2() {
        WxUserMessage build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("小学教课资源").description("点击查看")
                        .picUrl("http://ziyuan.shuziyuwen.com/upload/201904/15/201904151739408576.png")
                        .url("http://ziyuan.shuziyuwen.com/qbzy/index.html").build())
                .build();
        return build;
    }

    private WxUserMessage build3() {

        WxUserMessage build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("原中小学教育资源网").description("点击查看")
                        .picUrl("http://static.ruiwen.com/img/logo.png")
                        .url("http://www.ruiwen.com/").build())
                .build();
        return build;
    }

    private WxUserMessage build4() {
        WxUserMessage build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("初中教学资源网").description("点击查看")
                        .picUrl("http://cz.jb1000.com/Images/logo.gif")
                        .url("http://cz.jb1000.com/").build())
                .build();
        return build;
    }

    private WxUserMessage build5() {
        WxUserMessage build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("中学课件网").description("点击查看")
                        .picUrl("http://zxxkstatic.zxxk.com/ChildSite/skins/kejian/img/logo.jpg")
                        .url("http://kj.zxxk.com/").build())
                .build();
        return build;
    }

    private WxUserMessage build6() {
        WxUserMessage build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("高考资源网").description("点击查看")
                        .picUrl("https://www.ks5u.com/zt/2019gkrdtx/images/zlfx-logo.png")
                        .url("https://www.ks5u.com/index.shtml").build())
                .build();
        return build;
    }

    private WxUserMessage build7() {
        WxUserMessage build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("全国高考分数线").description("点击查看")
                        .picUrl("http://tb1.bdstatic.com/tb/cms/ngmis/file_1528341781654.jpg")
                        .url("http://kaoshi.edu.sina.com.cn/college/scorelist").build())
                .build();
        return build;
    }

    private WxUserMessage build8() {
        WxUserMessage build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("全国高考分数查询入口").description("点击查看")
                        .picUrl("https://www.eol.cn/favicon.ico")
                        .url("https://www.eol.cn/e_html/gk/chafen/index.shtml?province=bj#bj").build())
                .build();
        return build;
    }

    private WxUserMessage build9() {
        WxUserMessage build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("模拟志愿填报").description("点击查看")
                        .picUrl("https://node-img.b0.upaiyun.com/wmzy-pc/5.9.1/images/logo-wmzy/logo-v6.png")
                        .url("https://www.wmzy.com/").build())
                .build();
        return build;
    }

    private WxUserMessage build10() {
        WxUserMessage build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("志愿填报入口").description("点击查看")
                        .picUrl("https://gkcx.eol.cn/static/assets/images/top-logo-hash.png")
                        .url("https://gkcx.eol.cn/").build())
                .build();
        return build;
    }

    private WxUserMessage build11() {
        WxUserMessage build = WxMessage.newsBuilder()
                .addItem(WxMessageBody.News.Item.builder().title("高考专业").description("点击查看")
                        .picUrl("http://cdn.stc.gaokaopai.com/Public/Images/career/09.jpg")
                        .url("http://www.gaokaopai.com/zhiye.html").build())
                .build();
        return build;
    }
*/


}
