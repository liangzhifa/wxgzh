package com.zhifa.wxgzh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifa.wxgzh.domain.UserUploadImages;
import com.zhifa.wxgzh.mapper.UserUploadImagesMapper;
import com.zhifa.wxgzh.service.UserUploadImagesService;
@Service
public class UserUploadImagesServiceImpl extends ServiceImpl<UserUploadImagesMapper, UserUploadImages> implements UserUploadImagesService{

    @Autowired
    private UserUploadImagesMapper userUploadImagesMapper;

    @Async
    public void saveUserUploadImages(UserUploadImages uploadImages) {
        userUploadImagesMapper.insert(uploadImages);
    }

}
