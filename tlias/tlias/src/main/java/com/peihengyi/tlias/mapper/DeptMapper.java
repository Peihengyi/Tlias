package com.peihengyi.tlias.mapper;

import com.peihengyi.tlias.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {

        @Select("SELECT id, name, create_time, update_time, is_delete FROM dept WHERE is_delete = 0 ORDER BY update_time DESC")
        List<Dept> findAll();

        @Update("UPDATE dept SET is_delete = 1, update_time = NOW() WHERE id = #{id};")
        void deleteDept(Integer id);

        @Insert("INSERT INTO dept(name, create_time, update_time) VALUES (#{name}, #{createTime}, #{updateTime})")
        void addDept(Dept dept);

        @Select("SELECT name FROM dept WHERE id = #{id} AND is_delete = 0")
        Dept getName(Integer id);

        @Update("UPDATE dept SET name = #{name}, update_time = NOW() WHERE id = #{id} AND is_delete = 0")
        void changeName(String name, Integer id);
}
