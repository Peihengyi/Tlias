package com.peihengyi.tlias.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.peihengyi.tlias.mapper.EmpMapper;
import com.peihengyi.tlias.pojo.Dept;
import com.peihengyi.tlias.pojo.Emp;
import com.peihengyi.tlias.pojo.PageResult;
import com.peihengyi.tlias.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
        @Autowired
        private EmpMapper empMapper;

        @Override
        public PageResult pageResult(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end){
                PageHelper.startPage(page, pageSize);
                List<Emp> empList = empMapper.empList(name, gender, begin, end);
                Page<Emp> p = (Page<Emp>) empList;
                return new PageResult(p.getTotal(), p.getResult());
        }
}
