package com.zhifa.wxgzh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhifa.wxgzh.domain.BLoginInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BLoginInfoMapper extends BaseMapper<BLoginInfo> {
    void delByDedeuserid(String dedeuserid);


}