package com.zhifa.wxgzh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifa.wxgzh.domain.BLoginInfo;
import com.zhifa.wxgzh.mapper.BLoginInfoMapper;
import com.zhifa.wxgzh.service.BLoginInfoService;
@Service
public class BLoginInfoServiceImpl extends ServiceImpl<BLoginInfoMapper, BLoginInfo> implements BLoginInfoService{

    @Autowired
    private BLoginInfoMapper bLoginInfoMapper;

    @Override
    public BLoginInfo findByUserId(String userId) {
        LambdaQueryWrapper<BLoginInfo> queryWrapper = new LambdaQueryWrapper<BLoginInfo>().eq(BLoginInfo::getDedeuserid, userId);
        return bLoginInfoMapper.selectOne(queryWrapper);
    }
}
