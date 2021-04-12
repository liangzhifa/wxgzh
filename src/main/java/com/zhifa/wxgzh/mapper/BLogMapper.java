package com.zhifa.wxgzh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhifa.wxgzh.domain.BLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BLogMapper extends BaseMapper<BLog> {
    List<BLog> selectListByUid(String uId);

}