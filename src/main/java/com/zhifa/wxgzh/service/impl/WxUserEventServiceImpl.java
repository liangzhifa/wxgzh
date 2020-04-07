package com.zhifa.wxgzh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifa.wxgzh.domain.WxUserEvent;
import com.zhifa.wxgzh.mapper.WxUserEventMapper;
import com.zhifa.wxgzh.service.WxUserEventService;
@Service
public class WxUserEventServiceImpl extends ServiceImpl<WxUserEventMapper, WxUserEvent> implements WxUserEventService{

    @Autowired
    private WxUserEventMapper wxUserEventMapper;


}
