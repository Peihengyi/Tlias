package com.peihengyi.tlias.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClazzQueryParam {
        private String name;
        private LocalDate begin;
        private LocalDate end;
        private Integer page = 1;
        private Integer pageSize = 10;
}
