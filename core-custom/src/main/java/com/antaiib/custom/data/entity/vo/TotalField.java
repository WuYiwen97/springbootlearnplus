package com.antaiib.custom.data.entity.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 表格合计项pojo类
 */
public class TotalField {
    /**
     * 合计项
     */
    public static final List<FieldMsg> fields = new ArrayList<>();

    static {
        fields.add(new FieldMsg("totalField", "合计字段", Arrays.asList("1", "2")));
    }
}

