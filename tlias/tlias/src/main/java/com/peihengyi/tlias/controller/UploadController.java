package com.peihengyi.tlias.controller;
import com.peihengyi.tlias.pojo.Result;
import com.peihengyi.tlias.utils.AliyunOSSOperator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@Slf4j
@RestController
public class UploadController {

        @Autowired
        AliyunOSSOperator aliyunOSSOperator;
        @PostMapping("/upload")
        public Result upload(MultipartFile file) throws Exception {
                log.info("{}", file);
                String originFileName = file.getOriginalFilename();
                String url = aliyunOSSOperator.upload(file.getBytes(), originFileName);
                return Result.success(url);
        }
}
