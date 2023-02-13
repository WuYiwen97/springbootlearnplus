package com.antaiib.custom.data.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 表格合计项规则pojo类
 */
@Data
@AllArgsConstructor
public class FieldMsg {
    // 名称
    private String name;
    private String label;
    // 可选字段类型
    private List<String> type;
}
