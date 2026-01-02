package com.peihengyi.tlias.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.peihengyi.tlias.mapper.EmpExprMapper;
import com.peihengyi.tlias.mapper.EmpMapper;
import com.peihengyi.tlias.pojo.Dept;
import com.peihengyi.tlias.pojo.Emp;
import com.peihengyi.tlias.pojo.EmpQueryParam;
import com.peihengyi.tlias.pojo.PageResult;
import com.peihengyi.tlias.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
        @Autowired
        private EmpMapper empMapper;
        @Autowired
        private EmpExprMapper empExprMapper;

        @Override
        public PageResult pageResult(EmpQueryParam empQueryParam){
                PageHelper.startPage(empQueryParam.getPage(), empQueryParam.getPageSize());
                List<Emp> empList = empMapper.empList(empQueryParam);
                Page<Emp> p = (Page<Emp>) empList;
                return new PageResult(p.getTotal(), p.getResult());
        }

        @Override
        public void addEmp(Emp emp){
                emp.setCreateTime(LocalDateTime.now());
                empMapper.basicEmp(emp);
                if(!CollectionUtils.isEmpty(emp.getExprList())){
                        Integer id = empMapper.getID();
                        empExprMapper

                }


        }
}
