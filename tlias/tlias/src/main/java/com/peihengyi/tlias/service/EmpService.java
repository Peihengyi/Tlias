package com.peihengyi.tlias.service;

import com.peihengyi.tlias.pojo.Emp;
import com.peihengyi.tlias.pojo.EmpQueryParam;
import com.peihengyi.tlias.pojo.PageResult;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {
        PageResult pageResult(EmpQueryParam empQueryParam);

        void addEmp(Emp emp);

        void deleteEmp(List<Integer> empIdList);

        Emp getEmp(Integer id);

        void updateEmp(Emp emp);
}
