package com.peihengyi.tlias.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult {
        private Long numOfRecord;
        private List<Emp> findPageEmp;
}
