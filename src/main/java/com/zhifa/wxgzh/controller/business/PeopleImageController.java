package com.zhifa.wxgzh.controller.business;


import com.alibaba.fastjson.JSONObject;
import com.zhifa.wxgzh.baidu.config.AuthService;
import com.zhifa.wxgzh.baidu.result.ImgResult;
import com.zhifa.wxgzh.qiniu.ByteUpload;
import com.zhifa.wxgzh.util.Base64Util;
import com.zhifa.wxgzh.util.FileUtil;
import com.zhifa.wxgzh.util.HttpUtil;
import com.zhifa.wxgzh.util.LocalFileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;

@RestController
@Slf4j
public class PeopleImageController {
    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public String selfie_anime(String filePath) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/image-process/v1/selfie_anime";
        try {
            // 本地文件路径
            //String filePath = "E:\\报名照片\\myimgs\\zhifa.jpg";
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String imgParam = URLEncoder.encode(imgStr, "UTF-8");

            String param = "image=" + imgParam;

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = AuthService.getAuth();

            //System.out.println(result);
            return HttpUtil.post(url, accessToken, param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

       /* String anime = PeopleImageController.selfie_anime();
        ImgResult imgResult = JSONObject.parseObject(anime, ImgResult.class);
        System.out.println(imgResult.getImage());*/
    }

    @PostMapping("/uploadImg")
    public Object uploadImg(@RequestParam("file") MultipartFile file) {
        log.error("请求进来啦、、");
        String fileName = file.getOriginalFilename();//获取文件名
        String userHome = LocalFileUtil.getUserHome();
        String loaclFilePath = userHome + fileName;
        log.error("本地地址：{}",loaclFilePath);
        long startTime = new Date().getTime();
        BufferedOutputStream out = null;
        if (!file.isEmpty()) {
            try {
                out = new BufferedOutputStream(new FileOutputStream(new File(loaclFilePath)));
                out.write(file.getBytes());
                out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        String anime = selfie_anime(loaclFilePath);
        ImgResult imgResult = JSONObject.parseObject(anime, ImgResult.class);
        String timeStamp = "动漫头像"+new Date().getTime() + "_";
        String base64FileName = timeStamp + fileName;
        ByteUpload.GenerateImage(imgResult.getImage(), base64FileName);
        long endTime = new Date().getTime();
        log.error("保存本地到百度接口所需时间：{}",(endTime-startTime));
        String qiniuLoaclPah = userHome + base64FileName;
        log.error("本地地址：{}",qiniuLoaclPah);
        ByteUpload.uploadToQiniu(qiniuLoaclPah,base64FileName);
        log.error("调用七牛云接口所需时间：{}",(new Date().getTime()-endTime));
        String targetPath = "http://images.zhifa.tech/" + base64FileName;
        return targetPath;

    }

}
