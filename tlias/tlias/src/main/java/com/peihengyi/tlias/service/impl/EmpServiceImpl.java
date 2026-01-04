package com.peihengyi.tlias.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.peihengyi.tlias.mapper.EmpExprMapper;
import com.peihengyi.tlias.mapper.EmpMapper;
import com.peihengyi.tlias.pojo.*;
import com.peihengyi.tlias.service.EmpLogService;
import com.peihengyi.tlias.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
        @Autowired
        private EmpMapper empMapper;
        @Autowired
        private EmpExprMapper empExprMapper;
        @Autowired
        private EmpLogService empLogService;

        @Override
        public PageResult pageResult(EmpQueryParam empQueryParam){
                PageHelper.startPage(empQueryParam.getPage(), empQueryParam.getPageSize());
                List<Emp> empList = empMapper.empList(empQueryParam);
                Page<Emp> p = (Page<Emp>) empList;
                return new PageResult(p.getTotal(), p.getResult());
        }

        @Transactional(rollbackFor = Exception.class)
        @Override
        public void addEmp(Emp emp){
                try {
                        emp.setCreateTime(LocalDateTime.now());
                        log.info("{}", emp.getCreateTime());
                        empMapper.basicEmp(emp);
                        if(!CollectionUtils.isEmpty(emp.getExprList())){
                                List<EmpExpr> empExprList = emp.getExprList();
                                empExprList.forEach(empExpr -> {empExpr.setEmpId(emp.getId());});
                                log.info("{}", empExprList);
                                empExprMapper.exprEmp(emp.getExprList());
                        }
                } finally {
                        EmpLog empLog = new EmpLog(null, LocalDateTime.now(), "new emp:" + emp);
                        empLogService.insertLog(empLog);
                }
        }

        @Transactional
        public void deleteEmp(List<Integer> empIdList){
                log.info("{}", empIdList);
                empExprMapper.deleteEmpExpr(empIdList);
                empMapper.deleteEmp(empIdList);
        }

        @Transactional
        public Emp getEmp(Integer id){
                Emp emp = empMapper.getEmp(id);
                return emp;
        }

        @Transactional
        public void updateEmp(Emp emp){
                empMapper.updateEmp(emp);
                empExprMapper.deleteEmpExpr(Collections.singletonList(emp.getId()));
                empExprMapper.exprEmp(emp.getExprList());
        }
}
