package com.zhifa.wxgzh.qiniu;

import com.qiniu.common.QiniuException;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.util.Auth;

public class 删除空间中的文件 {
    public static void main(String[] args) {
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.region0());
        //...其他参数参考类注释
        String accessKey = "pzzac04NDj0tO4hKtuMp0fZh0_sZzq-Y3G48QWQd";
        String secretKey = "9O6pqS4nWTqNYUd3f6_2weAv41ev93HEjx2iyLx-";
        String bucket = "wxgzh-web";
        String key = "FjbjA3LPd_8EGIlXLFWrJOiZxv6r";

        Auth auth = Auth.create(accessKey, secretKey);
        BucketManager bucketManager = new BucketManager(auth, cfg);
        try {
            bucketManager.delete(bucket, key);
        } catch (QiniuException ex) {
            //如果遇到异常，说明删除失败
            System.err.println(ex.code());
            System.err.println(ex.response.toString());
        }
    }
}
