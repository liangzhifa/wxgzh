package com.zhifa.wxgzh.service;

import com.zhifa.wxgzh.domain.UserUploadImages;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserUploadImagesService extends IService<UserUploadImages>{

    public void saveUserUploadImages(UserUploadImages uploadImages);
}
