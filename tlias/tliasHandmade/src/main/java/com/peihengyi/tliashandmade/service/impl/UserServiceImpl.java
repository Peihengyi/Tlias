package com.peihengyi.tliashandmade.service.impl;

import com.peihengyi.tliashandmade.mapper.UserMapper;
import com.peihengyi.tliashandmade.pojo.Dept;
import com.peihengyi.tliashandmade.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

        @Autowired
        private UserMapper userMapper;

        @Override
        public List<Dept> findAll(){
             return userMapper.findAll();
        }

}
