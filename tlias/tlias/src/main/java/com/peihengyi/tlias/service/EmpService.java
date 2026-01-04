package com.peihengyi.tlias.service;

import com.peihengyi.tlias.pojo.Emp;
import com.peihengyi.tlias.pojo.EmpQueryParam;
import com.peihengyi.tlias.pojo.PageResultEmp;

import java.util.List;

public interface EmpService {
        PageResultEmp pageResult(EmpQueryParam empQueryParam);

        void addEmp(Emp emp);

        void deleteEmp(List<Integer> empIdList);

        Emp getEmp(Integer id);

        void updateEmp(Emp emp);
}
