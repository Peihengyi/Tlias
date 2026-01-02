package com.peihengyi.tlias.service;

import com.peihengyi.tlias.pojo.Emp;
import com.peihengyi.tlias.pojo.EmpQueryParam;
import com.peihengyi.tlias.pojo.PageResult;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public interface EmpService {
        PageResult pageResult(EmpQueryParam empQueryParam);

        void addEmp(Emp emp);
}
