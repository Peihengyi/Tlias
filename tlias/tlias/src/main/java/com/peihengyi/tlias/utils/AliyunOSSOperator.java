package com.peihengyi.tlias.utils;

import com.aliyun.oss.*;
import com.aliyun.oss.common.auth.CredentialsProviderFactory;
import com.aliyun.oss.common.auth.EnvironmentVariableCredentialsProvider;
import com.aliyun.oss.common.comm.SignVersion;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Component
public class AliyunOSSOperator {
        String bucketName = "java-web-billpei";

        public String upload(byte[] content, String originalFilename) throws  Exception{

                //file name:
                String dir = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM"));
                String fileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
                String objectName = dir + "/" + fileName;

                ClientBuilderConfiguration clientBuilderConfiguration = new ClientBuilderConfiguration();
                clientBuilderConfiguration.setSignatureVersion(SignVersion.V4);
                EnvironmentVariableCredentialsProvider credentialsProvider = CredentialsProviderFactory.newEnvironmentVariableCredentialsProvider();
                String region = "cn-beijing";
                String endpoint = "https://oss-cn-beijing.aliyuncs.com";
                OSS ossClient = OSSClientBuilder.create()
                                .endpoint(endpoint)
                                .credentialsProvider(credentialsProvider)
                                .clientConfiguration(clientBuilderConfiguration)
                                .region(region)
                                .build();

                try {
                        ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(content));
                } finally {
                        ossClient.shutdown();
                }

                return endpoint.split("//")[0] + "//" + bucketName + "." + endpoint.split("//")[1] + "/" + objectName;
        }
}
