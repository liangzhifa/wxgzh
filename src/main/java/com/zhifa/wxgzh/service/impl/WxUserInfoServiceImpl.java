package com.zhifa.wxgzh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifa.wxgzh.domain.WxUserInfo;
import com.zhifa.wxgzh.mapper.WxUserInfoMapper;
import com.zhifa.wxgzh.service.WxUserInfoService;
@Service
public class WxUserInfoServiceImpl extends ServiceImpl<WxUserInfoMapper, WxUserInfo> implements WxUserInfoService{

    @Autowired
    private WxUserInfoMapper wxUserInfoMapper;

    @Override
    public WxUserInfo getByOpenId(String s) {
        return wxUserInfoMapper.getByOpenId(s);
    }
}
