package com.goldeasy.user.util;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:tianliya
 * @CreateTime:2018-06-14 16:16
 * @Description:OSS上传图片业务实现
 **/
@Component
public class UploadImageUtil {
    public static final Logger logger = LoggerFactory.getLogger(UploadImageUtil.class);
    @Resource
    private OssConfigUtil configParam;
    public Map uoloadImage(MultipartFile file, String endpoint, String accessKeyId,
                                     String accessKeySecret, String bucketName, String filedir, String imgUrlPrefix) throws Exception {

        OssClientUtil ossClient=new OssClientUtil(endpoint,accessKeyId,accessKeySecret);
        String name = filedir+ossClient.uploadImg2Oss(file,bucketName,filedir);
        String imgUrl = ossClient.getImgUrl(name,filedir,bucketName);
        String[] split = imgUrl.split("\\?");
        Map map = new HashMap(3);
        String url = split[0];
        if (url.indexOf("/images") != -1){
            url = imgUrlPrefix+url.substring(url.indexOf("/images"));
        }else if (url.indexOf("/html") != -1){
            url = imgUrlPrefix+url.substring(url.indexOf("/html"));
        }
        map.put("url",url);
        map.put("fileName",name);
        return map;
    }

    public Boolean deleteImage(String key, String endpoint, String accessKeyId,
                               String accessKeySecret, String bucketName, String filedir) throws Exception{
        try{
            int start = key.indexOf(".com");
            key = key.substring(start+5);
            OssClientUtil ossClient=new OssClientUtil(endpoint,accessKeyId,accessKeySecret);
            ossClient.deleteFile(bucketName,key);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
