package com.peihengyi.tliashandmade.controller;

import com.peihengyi.tliashandmade.pojo.Dept;
import com.peihengyi.tliashandmade.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

        @Autowired
        private UserService userService;

        @GetMapping("/depts")
        public List<Dept> findAll(){
                return userService.findAll();
        }
}
