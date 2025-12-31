package com.peihengyi.tlias.service.impl;


import com.peihengyi.tlias.mapper.DeptMapper;
import com.peihengyi.tlias.pojo.Dept;
import com.peihengyi.tlias.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
        @Autowired
        private DeptMapper deptMapper;

        @Override
        public List<Dept> findAll(){
                return deptMapper.findAll();
        }

        @Override
        public void deleteDept(Integer id){
                deptMapper.deleteDept(id);
        }

        @Override
        public void addDept(Dept dept){
                dept.setCreateTime(LocalDateTime.now());
                dept.setUpdateTime(LocalDateTime.now());
                deptMapper.addDept(dept);
        }

        @Override
        public Dept getName(Integer deptId){
                return deptMapper.getName(deptId);
        }

        @Override
        public void changeName(String name, Integer id){
                deptMapper.changeName(name, id);
        }
}
