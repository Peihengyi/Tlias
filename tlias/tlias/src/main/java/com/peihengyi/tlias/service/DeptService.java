package com.peihengyi.tlias.service;

import com.peihengyi.tlias.pojo.Dept;

import java.util.List;

public interface DeptService {
        List<Dept> findAll();
        void deleteDept(Integer id);
        void addDept(Dept dept);
        Dept getName(Integer deptId);
        void changeName(String name, Integer id);
}
