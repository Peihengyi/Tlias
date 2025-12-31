package com.peihengyi.tlias.controller;

import com.peihengyi.tlias.pojo.Dept;
import com.peihengyi.tlias.pojo.Result;
import com.peihengyi.tlias.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class DeptController {

        @Autowired
        private DeptService deptService;

        //api 1.1
        @GetMapping("/depts")
        public Result list(){
                log.info("Start 1.1, find all department");
                List<Dept> deptList = deptService.findAll();
                return Result.success(deptList);
        }

        //api 1.2
        @DeleteMapping("/depts")
        public Result deleteDept(Integer id){
                log.info("Start 1.2, set id: {} department in delete", id);
                deptService.deleteDept(id);
                return Result.success();
        }

        //api 1.3
        @PostMapping("/depts")
        public Result addDept(Dept dept){
                log.info("Start 1.3, add department {} in", dept);
                deptService.addDept(dept);
                System.out.println(dept);
                return Result.success();
        }

        //api 1.4
        @GetMapping("/depts/{id}")
        public Result getName(@PathVariable Integer id){
                log.info("Start 1.4, get name of id: {} department", id);
                Dept dept = deptService.getName(id);
                return Result.success(dept);
        }

        //api 1.5
        @PutMapping("/depts")
        public Result changeName(String name, Integer id){
                log.info("Start 1.5, change name of {} into {}", id, name);
                deptService.changeName(name, id);
                return Result.success();
        }

}
