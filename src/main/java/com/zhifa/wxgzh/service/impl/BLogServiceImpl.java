package com.zhifa.wxgzh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifa.wxgzh.mapper.BLogMapper;
import com.zhifa.wxgzh.domain.BLog;
import com.zhifa.wxgzh.service.BLogService;
@Service
public class BLogServiceImpl extends ServiceImpl<BLogMapper, BLog> implements BLogService{

    @Autowired
    private BLogMapper bLogMapper;

    @Override
    public List<BLog> getList() {
        return bLogMapper.selectList(null);
    }

}
