package com.peihengyi.tlias.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResultClazz {
        private Long numOfRecord;
        private List<Clazz> findPageClazz;
}
