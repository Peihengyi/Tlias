package com.peihengyi.tlias.mapper;

import com.peihengyi.tlias.pojo.Emp;
import com.peihengyi.tlias.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmpMapper {

        List<Emp> empList(EmpQueryParam empQueryParam);


        @Options(useGeneratedKeys = true, keyProperty = "id")
        @Insert("INSERT INTO  emp(image, username, name, gender, job, entry_date, dept_id, phone, salary, emp.create_time, update_time) VALUES (#{image}, #{username}, #{name}, #{gender}, #{job}, #{entryDate}, #{deptId}, #{phone}, #{salary}, #{createTime}, NOW())")
        void basicEmp(Emp emp);


        void deleteEmp(List<Integer> empId);

        Emp getEmp(Integer id);

        void updateEmp(Emp emp);

        @MapKey("pos")
        List<Map<String, Object>> countEmpJob();
}
