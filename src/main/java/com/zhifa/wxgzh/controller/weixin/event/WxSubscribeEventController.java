package com.zhifa.wxgzh.controller.weixin.event;

import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.annotation.WxEventMapping;
import com.mxixm.fastboot.weixin.module.event.WxEvent;
import com.mxixm.fastboot.weixin.module.user.WxUser;
import com.mxixm.fastboot.weixin.module.web.WxRequest;
import com.zhifa.wxgzh.domain.WxUserInfo;
import com.zhifa.wxgzh.service.WxUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import java.util.Date;

@WxController
@Slf4j
public class WxSubscribeEventController {


    @Autowired
    private WxUserInfoService wxUserInfoService;


    /**
     * 退订
     * 接受微信事件
     *
     * @param wxRequest
     * @param wxUser
     */
    @WxEventMapping(type = WxEvent.Type.UNSUBSCRIBE)
    public void unsubscribe(WxRequest wxRequest, WxUser wxUser) {
        System.out.println(wxUser.getNickName() + "退订了公众号");
    }

    /*
     *
     * wxUser==>com.mxixm.fastboot.weixin.module.user.WxUser(
     * SUBSCRIBE=1,
     * openId=ovwMI59y1dfGKq2kJ9yDn96-kUPM,
     *  nickName=小智,
     * sex=1,
     * city=茂名,
     *  country=中国,
     *  province=广东,
     *  language=zh_CN,
     *  headImgUrl=http://thirdwx.qlogo.cn/mmopen/JTaXgpzxvbp03evEabsJHkfnibBXUyNibUoALbsBh4kkggvhyhrtgSQiczkglEFwOFYbwyzuSXG6CsHrB9LRO47dA/132,
     *  subscribeTime=Thu Mar 19 16:17:03 CST 2020,
     * unionId=null,
     * remark=, groupId=0, privileges=null, tagIdList=[])
     * */

    /**
     * 订阅
     *
     * @param wxRequest
     * @param wxUser
     * @return
     */
    @WxEventMapping(type = WxEvent.Type.SUBSCRIBE)
    public String subscribe(WxRequest wxRequest, WxUser wxUser) {
        System.out.println(wxUser.getNickName() + "订了公众号");
        saveWxUserInfo(wxUser);
        log.info("wxRequest==>{},\nwxUser==>{}", wxRequest, wxUser);
        return "非常感谢 " + wxUser.getNickName() + "/:rose  关注小智的个人公众号^_^   /:rose";
    }

    @Async
    public void saveWxUserInfo(WxUser wxUser) {
        WxUserInfo wxUserInfo = new WxUserInfo();
        BeanUtils.copyProperties(wxUser, wxUserInfo);
        wxUserInfo.setSex(wxUser.getSex()+"");
        wxUserInfo.setSubscribe(wxUser.getSubscribe()+"");
        wxUserInfo.setCreateTime(new Date());
        wxUserInfoService.save(wxUserInfo);
    }

}
