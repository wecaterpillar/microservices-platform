package org.openea.file.config;

import io.minio.errors.*;
import lombok.extern.slf4j.XSlf4j;
import org.openea.file.model.FileInfo;
import org.openea.file.properties.FileServerProperties;
import org.openea.file.service.impl.AbstractIFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import io.minio.MinioClient;
import io.minio.policy.PolicyType;
import org.springframework.web.multipart.MultipartFile;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@lombok.extern.slf4j.Slf4j
@Configuration
@ConditionalOnProperty(name = "openea.file-server.type", havingValue = "minio")
public class MinioOSSAutoConfigure {

    @Autowired
    private FileServerProperties fileProperties;

    @Bean
    public MinioClient ossClient(){
        MinioClient minioClient = null;
        try {
            minioClient = new MinioClient(fileProperties.getOss().getEndpoint(), fileProperties.getOss().getAccessKey(), fileProperties.getOss().getAccessKeySecret());
            boolean isExist = minioClient.bucketExists(fileProperties.getOss().getBucketName());
            if (isExist) {
                log.info("存储桶已经存在！");
            } else {
                //创建存储桶并设置只读权限
                minioClient.makeBucket(fileProperties.getOss().getBucketName());
                minioClient.setBucketPolicy(fileProperties.getOss().getBucketName(), "*.*", PolicyType.READ_ONLY);
            }
        }catch (Exception e){
            log.error("get MinioClient fail:"+e.getMessage(), e);
        }
        return  minioClient;
    }

    @Service
    public class MinioOssServiceImpl extends AbstractIFileService {
        @Autowired
        private MinioClient ossClient;

        @Override
        protected String fileType() {
            return fileProperties.getType();
        }

        @Override
        protected void uploadFile(MultipartFile file, FileInfo fileInfo) throws Exception {
            if (!ossClient.bucketExists(fileProperties.getOss().getBucketName())) {
                //创建存储桶并设置只读权限
                ossClient.makeBucket(fileProperties.getOss().getBucketName());
                ossClient.setBucketPolicy(fileProperties.getOss().getBucketName(), "*.*", PolicyType.READ_ONLY);
            }
            ossClient.putObject(fileProperties.getOss().getBucketName(), fileInfo.getName(), file.getInputStream(), fileInfo.getContentType());
            fileInfo.setUrl(fileProperties.getOss().getDomain() + "/" + fileInfo.getName());
        }

        @Override
        protected boolean deleteFile(FileInfo fileInfo) {
            try {
                ossClient.removeObject(fileProperties.getOss().getBucketName(), fileInfo.getName());
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }

    }
}
