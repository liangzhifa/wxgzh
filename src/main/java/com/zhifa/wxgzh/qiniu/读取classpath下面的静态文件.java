package com.zhifa.wxgzh.qiniu;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.BatchStatus;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.ResourceUtils.CLASSPATH_URL_PREFIX;

public class 读取classpath下面的静态文件 {

    public static void main(String[] args) throws Exception {
        List<String> fileAbsolutePath = new ArrayList<>();
        List<String> fileName = new ArrayList<>();
        File fileDir = ResourceUtils.getFile(CLASSPATH_URL_PREFIX + "static");
        if (!fileDir.exists()) {
            System.err.println("not such dir or file");
            return;
        }
        File[] files = fileDir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                String pathPrefix = file.getName() + File.separator;
                File[] listFiles = file.listFiles();
                for (File listFile : listFiles) {
                    fileAbsolutePath.add(listFile.getAbsolutePath());
                    fileName.add(pathPrefix + listFile.getName());
                    //System.out.println();
                }

            } else {
                fileAbsolutePath.add(file.getAbsolutePath());
                fileName.add(file.getName());
                System.out.println();
            }
        }
        /*先批量删除*/
        batchDel(fileName.toArray(new String[fileName.size()]));
        /*然后就是上传文件*/
        BatchUpload(fileAbsolutePath,fileName);

        System.out.println();

    }

    public static void batchDel(String[] keyList) {
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.region0());
        //...其他参数参考类注释
        String accessKey = "pzzac04NDj0tO4hKtuMp0fZh0_sZzq-Y3G48QWQd";
        String secretKey = "9O6pqS4nWTqNYUd3f6_2weAv41ev93HEjx2iyLx-";
        String bucket = "wxgzh-web";
        Auth auth = Auth.create(accessKey, secretKey);
        BucketManager bucketManager = new BucketManager(auth, cfg);
        try {
            //单次批量请求的文件数量不得超过1000
           /* String[] keyList = new String[]{
                    "qiniu.jpg",
                    "qiniu.mp4",
                    "qiniu.png",
            };*/
            BucketManager.BatchOperations batchOperations = new BucketManager.BatchOperations();
            batchOperations.addDeleteOp(bucket, keyList);
            Response response = bucketManager.batch(batchOperations);
            BatchStatus[] batchStatusList = response.jsonToObject(BatchStatus[].class);
            for (int i = 0; i < keyList.length; i++) {
                BatchStatus status = batchStatusList[i];
                String key = keyList[i];
                System.out.print(key + "\t");
                if (status.code == 200) {
                    System.out.println("delete success");
                } else {
                    System.out.println(status.data.error);
                }
            }
        } catch (QiniuException ex) {
            System.err.println(ex.response.toString());
        }
    }

    public static void BatchUpload(List<String> fileAbsolutePath,List<String> fileName) {
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.huadong());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        String accessKey = "pzzac04NDj0tO4hKtuMp0fZh0_sZzq-Y3G48QWQd";
        String secretKey = "9O6pqS4nWTqNYUd3f6_2weAv41ev93HEjx2iyLx-";
        String bucket = "wxgzh-web";

        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        try {
            for (int i = 0; i < fileAbsolutePath.size(); i++) {
                //如果是Windows情况下，格式是 D:\\qiniu\\test.png
                String localFilePath = fileAbsolutePath.get(i);
                //默认不指定key的情况下，以文件内容的hash值作为文件名
                String key = fileName.get(i);
                Response response = uploadManager.put(localFilePath, key, upToken);
                //解析上传成功的结果
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                System.out.println(putRet.key+"\t"+"上传成功");
            }
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }
    }
}


