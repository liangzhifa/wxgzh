package com.zhifa.wxgzh.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zhifa.wxgzh.constant.BiliConstant;
import com.zhifa.wxgzh.domain.BLoginInfo;
import com.zhifa.wxgzh.dto.BiliLoginUserInfoDto;
import com.zhifa.wxgzh.mapper.BLoginUrlMapper;
import com.zhifa.wxgzh.service.BLoginInfoService;
import com.zhifa.wxgzh.util.BilibiliApiUtil;
import com.zhifa.wxgzh.util.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifa.wxgzh.mapper.BLogMapper;
import com.zhifa.wxgzh.domain.BLog;
import com.zhifa.wxgzh.service.BLogService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class BLogServiceImpl extends ServiceImpl<BLogMapper, BLog> implements BLogService{

    @Autowired
    private BLogMapper bLogMapper;

    @Autowired
    private BLoginInfoService bLoginInfoService;

    @Autowired
    private BLoginUrlMapper bLoginUrlMapper;



    @Override
    public List<BLog> getList() {
        return bLogMapper.selectList(new LambdaQueryWrapper<BLog>().orderByDesc(BLog::getCreateTime));
    }

    @Transactional
    @Override
    public BLoginInfo loginByOauthKey(String oauthKey) {
        String s = BilibiliApiUtil.sendHttpPost(BiliConstant.getLoginInfo(oauthKey), null, null);
        BiliLoginUserInfoDto biliLoginUserInfoDto = null;
        try {

             biliLoginUserInfoDto = JSONObject.parseObject(s, BiliLoginUserInfoDto.class);

        }catch (Exception e){
            log.error( "谁扫码 不点确定：{}",oauthKey);
            return null;

        }

        BLoginInfo bLoginInfo = new BLoginInfo();
        bLoginInfo.setTs(biliLoginUserInfoDto.getTs());
        bLoginInfo.setUrl(biliLoginUserInfoDto.getData().getUrl());
        Map<String, String> paramMap = HttpUtil.urlSplit(biliLoginUserInfoDto.getData().getUrl());

        bLoginInfo.setDedeuserid(paramMap.get("dedeuserid"));
        bLoginInfo.setDedeuseridCkmd5(paramMap.get("dedeuserid__ckmd5"));
        bLoginInfo.setExpires(paramMap.get("expires"));
        bLoginInfo.setSessdata(paramMap.get("sessdata"));
        bLoginInfo.setBiliJct(paramMap.get("bili_jct"));
        bLoginInfo.setGourl(paramMap.get("gourl"));
        bLoginInfoService.delByDedeuserid(paramMap.get("dedeuserid"));

        boolean save = bLoginInfoService.save(bLoginInfo);

        return bLoginInfo;
    }

    @Override
    public List<BLog> getList(String uId) {
        return bLogMapper.selectListByUid(uId);
    }

}
