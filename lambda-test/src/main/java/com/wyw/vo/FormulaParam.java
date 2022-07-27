package com.wyw.vo;

import lombok.Data;

@Data
public class FormulaParam {
    /**
     * 关键字 if else if else
     */
    private String keyword;
    /**
     * 条件
     */
    private String condition;
    /**
     * 结果
     */
    private String result;
    /**
     * 排序
     */
    private Integer sort;
}