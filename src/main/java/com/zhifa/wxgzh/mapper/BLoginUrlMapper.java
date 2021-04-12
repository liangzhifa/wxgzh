package com.zhifa.wxgzh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhifa.wxgzh.domain.BLoginUrl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BLoginUrlMapper extends BaseMapper<BLoginUrl> {
    List<BLoginUrl> chekQRCodeStatus(String s);

    void setSatus(@Param("oauthkey") String oauthkey, @Param("status") String status);


    void incStatusTimes(String oauthKey);

}