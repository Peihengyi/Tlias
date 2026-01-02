package com.peihengyi.tlias.mapper;

import com.peihengyi.tlias.pojo.Emp;
import com.peihengyi.tlias.pojo.EmpExpr;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpExprMapper {

        @Insert("INSERT INTO emp_expr(emp_id, begin, end, company, job) VALUES ()")
        void exprEmp(List<EmpExpr> exprList);
}
