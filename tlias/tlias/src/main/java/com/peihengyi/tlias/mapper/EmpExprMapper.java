package com.peihengyi.tlias.mapper;

import com.peihengyi.tlias.pojo.Emp;
import com.peihengyi.tlias.pojo.EmpExpr;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface EmpExprMapper {

        void exprEmp(List<EmpExpr> exprList);

        void deleteEmpExpr(List<Integer> empId);

}
