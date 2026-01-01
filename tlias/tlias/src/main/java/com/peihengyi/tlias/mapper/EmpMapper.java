package com.peihengyi.tlias.mapper;

import com.peihengyi.tlias.pojo.Emp;
import com.peihengyi.tlias.pojo.EmpQueryParam;
import com.peihengyi.tlias.pojo.PageResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

        List<Emp> empList(EmpQueryParam empQueryParam);

}
