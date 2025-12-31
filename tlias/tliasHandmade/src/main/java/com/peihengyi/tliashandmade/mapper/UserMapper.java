package com.peihengyi.tliashandmade.mapper;

import com.peihengyi.tliashandmade.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
        @Results({@Result(column = "create_time", property = "createTime"),
                        @Result(column = "update_time", property = "updateTime")})

        @Select("SELECT id, name, create_time, update_time FROM dept ORDER BY update_time DESC")
        List<Dept> findAll();
}
