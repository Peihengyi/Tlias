package com.peihengyi.tlias.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
        private Integer id;
        private String name;
        private String no;
        private Integer gender;
        private String phone;
        private String idCard;
        private Integer isCollege;
        private String address;
        private Integer degree;
        private LocalDate graduationDate;
        private Integer clazzId;
        private Integer violationCount;
        private Integer violationScore;
        private LocalDateTime createTime;
        private LocalDateTime updateTime;
}
