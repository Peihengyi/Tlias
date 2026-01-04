package com.peihengyi.tlias.mapper;

import com.peihengyi.tlias.pojo.Clazz;
import com.peihengyi.tlias.pojo.ClazzQueryParam;
import com.peihengyi.tlias.service.ClazzService;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ClazzMapper {
        List<Clazz> getClazz(ClazzQueryParam clazzQueryParam);

        @Update("UPDATE clazz SET is_delete = 1, clazz.update_time = NOW() WHERE id = #{id}")
        void deletClazz(Integer id);

        @Insert("INSERT INTO clazz(name, room, begin_date, end_date, master_id, subject, create_time, update_time) VALUES (#{name}, #{room}, #{beginDate}, #{endDate}, #{masterId}, #{subject}, NOW(), NOW())")
        void addClazz(Clazz clazz);
}
