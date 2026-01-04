package com.peihengyi.tlias.controller;

import com.peihengyi.tlias.pojo.Emp;
import com.peihengyi.tlias.pojo.EmpQueryParam;
import com.peihengyi.tlias.pojo.Result;
import com.peihengyi.tlias.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

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

        @PostMapping("/emps")
        public  Result addEmp(@RequestBody Emp emp){
                log.info("{}", emp);
                empService.addEmp(emp);
                return Result.success();
        }

        @DeleteMapping("/emps")
        public Result deleteEmp(@RequestBody List<Integer> ids){
                empService.deleteEmp(ids);
                return Result.success();
        }

        @GetMapping("/emps/{id}")
        public Result getEmp(@PathVariable Integer id){
                return Result.success(empService.getEmp(id));
        }


        @PutMapping("/emps")
        public Result updateEmp(@RequestBody Emp emp){
                empService.updateEmp(emp);
                return Result.success();
        }

}
