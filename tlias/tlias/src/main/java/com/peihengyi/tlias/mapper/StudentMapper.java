package com.peihengyi.tlias.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {
        @Select("SELECT COUNT(*) FROM student WHERE clazz_id = #{id} AND is_delete = 0")
        Integer getIdStudent(Integer id);
}
