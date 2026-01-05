package com.peihengyi.tlias.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.peihengyi.tlias.exception.pojo.DeleteClazzException;
import com.peihengyi.tlias.mapper.ClazzMapper;
import com.peihengyi.tlias.mapper.StudentMapper;
import com.peihengyi.tlias.pojo.Clazz;
import com.peihengyi.tlias.pojo.ClazzQueryParam;
import com.peihengyi.tlias.pojo.PageResultClazz;
import com.peihengyi.tlias.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {

        @Autowired
        private ClazzMapper clazzMapper;

        @Autowired
        private StudentMapper studentMapper;

        public PageResultClazz getClazz(ClazzQueryParam clazzQueryParam){
                PageHelper.startPage(clazzQueryParam.getPage(), clazzQueryParam.getPageSize());
                List<Clazz> clazzList = clazzMapper.getClazz(clazzQueryParam);
                Page<Clazz> clazzPage = (Page<Clazz>)clazzList;
                return new PageResultClazz(clazzPage.getTotal(), clazzPage.getResult());

        }
        @Transactional
        public void deleteClazz(Integer id){
                Integer studentNumber = studentMapper.getIdStudent(id);
                if(studentNumber != 0){
                        throw new DeleteClazzException("Still student in the clazz");
                }
                clazzMapper.deletClazz(id);

        }

        public void addClazz(Clazz clazz){
                clazzMapper.addClazz(clazz);
        }

        public Clazz getIdClazz(Integer id){
                return clazzMapper.getIdClazz(id);
        }
        public void updateClazz(Clazz clazz){clazzMapper.updateClazz(clazz);}
}
