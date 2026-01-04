package com.peihengyi.tlias.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobOption {
        private List<String> jobList;
        private List<Integer> dataList;
}
