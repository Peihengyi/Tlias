package com.peihengyi.tlias.mapper;

import com.peihengyi.tlias.pojo.EmpLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpLogMapper {

        @Insert("INSERT INTO emp_log(operate_time, info) VALUES  (#{operateTime}, #{info})")
        public void insert(EmpLog empLog);

}
