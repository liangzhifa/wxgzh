package com.zhifa.wxgzh.service;

import com.zhifa.wxgzh.domain.BLoginInfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface BLoginInfoService extends IService<BLoginInfo>{


    BLoginInfo findByUserId(String userId);
}
