package com.zhifa.wxgzh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhifa.wxgzh.domain.WxUserInfo;import org.apache.ibatis.annotations.Param;

public interface WxUserInfoMapper extends BaseMapper<WxUserInfo> {
    WxUserInfo getByOpenId(@Param("wxOpenId") String wxOpenId);
}