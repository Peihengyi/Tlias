package com.peihengyi.tlias.service;


import com.peihengyi.tlias.pojo.Clazz;
import com.peihengyi.tlias.pojo.ClazzQueryParam;
import com.peihengyi.tlias.pojo.PageResultClazz;

import java.util.List;

public interface ClazzService {
        PageResultClazz getClazz(ClazzQueryParam clazzQueryParam);
        void deleteClazz(Integer id);
        void addClazz(Clazz clazz);
}
