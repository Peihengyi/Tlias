package com.peihengyi.tlias.controller;

import com.peihengyi.tlias.pojo.EmpQueryParam;
import com.peihengyi.tlias.pojo.Result;
import com.peihengyi.tlias.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@Slf4j
@RestController
public class EmpController {
        @Autowired
        private EmpService empService;

        @GetMapping("/emps")
        public Result pageResult(EmpQueryParam empQueryParam){
                log.info("{}", empQueryParam);
                return Result.success(empService.pageResult(empQueryParam));
        }
}
