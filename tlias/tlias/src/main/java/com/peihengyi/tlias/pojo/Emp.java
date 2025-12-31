package com.peihengyi.tlias.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Emp {
        private Integer id;
        private String username;
        private String password;
        private String name;
        private Integer gender;
        private String phone; //手机号
        private Integer job; //职位, 1:班主任,2:讲师,3:学工主管,4:教研主管,5:咨询师
        private Integer salary; //薪资
        private String image; //头像
        private LocalDate entryDate; //入职日期
        private Integer deptId; //关联的部门ID
        private LocalDateTime createTime; //创建时间
        private LocalDateTime updateTime;
        private Integer isDelete;
}
