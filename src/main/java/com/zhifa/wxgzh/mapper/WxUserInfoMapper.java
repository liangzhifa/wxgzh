package com.zhifa.wxgzh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhifa.wxgzh.domain.WxUserInfo;

public interface WxUserInfoMapper extends BaseMapper<WxUserInfo> {
    /*ding定时器 让数据库保持连接*/
    int getTiming();
}