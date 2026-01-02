package com.peihengyi.tlias.mapper;

import com.peihengyi.tlias.pojo.Emp;
import com.peihengyi.tlias.pojo.EmpQueryParam;
import com.peihengyi.tlias.pojo.PageResult;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

        List<Emp> empList(EmpQueryParam empQueryParam);

        @Insert("INSERT INTO  emp(image, username, name, gender, job, entry_date, dept_id, phone, salary, update_time) VALUES (#{image}, #{username}, #{name}, #{gender}, #{job}, #{entryDate}, #{deptId}, #{phone}, #{salary}, NOW())")
        void basicEmp(Emp emp);

        @Select("SELECT  COUNT(*) FROM emp")
        Integer getID();

}
