package com.peihengyi.tlias.controller;

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
        public Result pageResult(@RequestParam(defaultValue = "1") Integer page,
                                 @RequestParam(defaultValue = "10") Integer pageSize,
                                 String name, Integer gender,
                                 @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                                 @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
                log.info("{}{}{}{}{}{}", page, pageSize, name, gender,begin,end);
                return Result.success(empService.pageResult(page, pageSize, name, gender, begin, end));
        }
}
