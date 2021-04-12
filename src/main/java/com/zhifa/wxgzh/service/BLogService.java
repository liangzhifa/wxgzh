package com.zhifa.wxgzh.service;

import com.zhifa.wxgzh.domain.BLog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifa.wxgzh.domain.BLoginInfo;

import java.util.List;

public interface BLogService extends IService<BLog>{

    List<BLog> getList();


    BLoginInfo loginByOauthKey(String oauthKey);

    List<BLog> getList(String uId);

}
