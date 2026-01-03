package com.peihengyi.tlias.service.impl;

import com.peihengyi.tlias.mapper.EmpLogMapper;
import com.peihengyi.tlias.pojo.EmpLog;
import com.peihengyi.tlias.service.EmpLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpLogServiceImpl implements EmpLogService {

        @Autowired
        private EmpLogMapper empLogMapper;

        @Override
        @Transactional(propagation = Propagation.REQUIRES_NEW)
        public void insertLog(EmpLog empLog){
                empLogMapper.insert(empLog);
        }
}
