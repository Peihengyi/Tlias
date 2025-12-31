package com.peihengyi.tlias.controller;

import com.peihengyi.tlias.pojo.Dept;
import com.peihengyi.tlias.pojo.Result;
import com.peihengyi.tlias.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

        @Autowired
        private DeptService deptService;

        //api 1.1
        @GetMapping("/depts")
        public Result list(){
                System.out.println("Showing all department data");
                List<Dept> deptList = deptService.findAll();
                return Result.success(deptList);
        }

        //api 1.2
        @DeleteMapping("/depts")
        public Result deleteDept(Integer id){
                deptService.deleteDept(id);
                return Result.success();
        }

        //api 1.3
        @PostMapping("/depts")
        public Result addDept(Dept dept){
                deptService.addDept(dept);
                System.out.println(dept);
                return Result.success();
        }

        //api 1.4
        @GetMapping("/depts/{id}")
        public Result getName(@PathVariable Integer id){
                System.out.println(id);
                Dept dept = deptService.getName(id);
                return Result.success(dept);
        }

        //api 1.5
        @PutMapping("/depts")
        public Result changeName(String name, Integer id){
                System.out.println(name + id);
                deptService.changeName(name, id);
                return Result.success();
        }

}
