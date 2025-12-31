package com.peihengyi.tlias.service;

import com.peihengyi.tlias.pojo.PageResult;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public interface EmpService {
        PageResult pageResult(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);
}
