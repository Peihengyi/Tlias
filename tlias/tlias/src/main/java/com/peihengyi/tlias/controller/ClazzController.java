package com.peihengyi.tlias.controller;

import com.peihengyi.tlias.pojo.Clazz;
import com.peihengyi.tlias.pojo.ClazzQueryParam;
import com.peihengyi.tlias.pojo.Result;
import com.peihengyi.tlias.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class ClazzController {
        @Autowired
        private ClazzService clazzService;

        @GetMapping("/clazzs")
        public Result getClazz(ClazzQueryParam clazzQueryParam){
                return Result.success(clazzService.getClazz(clazzQueryParam));
        }

        @DeleteMapping("/clazzs/{id}")
        public Result deleteClazz(@PathVariable Integer id){
                clazzService.deleteClazz(id);
                return Result.success();
        }

        @PostMapping("/clazzs")
        public Result addClazz(@RequestBody Clazz clazz){
                clazzService.addClazz(clazz);
                return Result.success();
        }
}
