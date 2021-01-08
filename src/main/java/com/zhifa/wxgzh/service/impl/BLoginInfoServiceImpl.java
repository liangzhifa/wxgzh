package com.zhifa.wxgzh.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifa.wxgzh.domain.BLoginInfo;
import com.zhifa.wxgzh.mapper.BLoginInfoMapper;
import com.zhifa.wxgzh.service.BLoginInfoService;
@Service
public class BLoginInfoServiceImpl extends ServiceImpl<BLoginInfoMapper, BLoginInfo> implements BLoginInfoService{

}
