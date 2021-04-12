package com.zhifa.wxgzh.service.impl;

import com.zhifa.wxgzh.domain.BLoginInfo;
import com.zhifa.wxgzh.service.BLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifa.wxgzh.mapper.BLoginUrlMapper;
import com.zhifa.wxgzh.domain.BLoginUrl;
import com.zhifa.wxgzh.service.BLoginUrlService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

@Service
public class BLoginUrlServiceImpl extends ServiceImpl<BLoginUrlMapper, BLoginUrl> implements BLoginUrlService{


    @Autowired
    private BLoginUrlMapper bLoginUrlMapper;

    @Autowired
    private BLogService bLogService;


    @Override
    public void chekQRCodeStatus() {
        /*得到扫码之后没有*/
        List<BLoginUrl> bLoginUrls = bLoginUrlMapper.chekQRCodeStatus("0");

        bLoginUrls.parallelStream().forEach(bLoginUrl -> {
            bLoginUrlMapper.incStatusTimes(bLoginUrl.getOauthkey());
            BLoginInfo bLoginInfo = bLogService.loginByOauthKey(bLoginUrl.getOauthkey());
            if (!ObjectUtils.isEmpty(bLoginInfo)){
                bLoginUrlMapper.setSatus(bLoginUrl.getOauthkey(),"1");
            }
        });

    }


}
