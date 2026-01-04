package com.peihengyi.tlias.exception;


import com.peihengyi.tlias.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExeptionHandeler {
        public Result handelException(Exception e){
                log.error("error happend", e);
                return Result.error("error");
        }
}
