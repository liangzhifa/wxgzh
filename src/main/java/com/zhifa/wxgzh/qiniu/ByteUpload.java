package com.zhifa.wxgzh.qiniu;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import com.zhifa.wxgzh.util.LocalFileUtil;
import org.apache.commons.codec.binary.Base64;
import org.springframework.util.ResourceUtils;
import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class ByteUpload {
    public static boolean GenerateImage(String imgStr, String photoname) {
        //对字节数组字符串进行Base64解码并生成图片
        //图像数据为空
        if (imgStr == null)
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            //Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {
                    //调整异常数据
                    b[i] += 256;
                }
            }
            //生成jpeg图片
            //String imagePath = ResourceUtils.getURL("classpath:").getPath();

            // 用户主目录


            String imagePath = LocalFileUtil.getUserHome();
            //System.currentTimeMillis()
            //新生成的图片
            String imgFilePath = imagePath + photoname;
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void uploadToQiniu(String localFilePath,String fileName ){
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.huadong());
//...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
//...生成上传凭证，然后准备上传
        //...生成上传凭证，然后准备上传
        String accessKey = "pzzac04NDj0tO4hKtuMp0fZh0_sZzq-Y3G48QWQd";
        String secretKey = "9O6pqS4nWTqNYUd3f6_2weAv41ev93HEjx2iyLx-";
        String bucket = "liangzhifa";
        //默认不指定key的情况下，以文件内容的hash值作为文件名

        try {
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            try {
                Response response = uploadManager.put(localFilePath,fileName, upToken);
                //解析上传成功的结果
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                System.out.println(putRet.key);
                System.out.println(putRet.hash);
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (Exception ex) {
            //ignore
        }
    }
    /// <
    public static void main(String[] args) throws UnsupportedEncodingException, QiniuException {

    }
}
