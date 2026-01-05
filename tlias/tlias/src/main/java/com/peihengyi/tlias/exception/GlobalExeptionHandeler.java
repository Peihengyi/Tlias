package com.peihengyi.tlias.exception;


import com.peihengyi.tlias.exception.pojo.DeleteClazzException;
import com.peihengyi.tlias.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExeptionHandeler {
        public Result handelException(Exception e){
                log.error("error happend", e);
                return Result.error("error");
        }

        @ExceptionHandler(DeleteClazzException.class)
        public Result handleDeleteClazzException(DeleteClazzException e) {
                log.warn("业务异常：{}", e.getMessage());
                return Result.error(e.getMessage());
        }
}
