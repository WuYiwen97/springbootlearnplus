package com.antaiib.custom.data.entity.vo;

import com.antaiib.custom.data.entity.CustomTableTableRltn;
import lombok.Data;

import java.util.List;

@Data
public class DeleteTableRltnVO {
    String tableName;
    String appDomain;
    List<CustomTableTableRltn> rltnList;
}