package com.antaiib.custom.param.v3;

import lombok.Data;

import java.util.List;

@Data
public class PreExcFormulaParam {
    /**
     * 公式
     */
    private String formula;

    /**
     * 1-普通公式 2-高级公式
     */
    private Integer type;

    private List<FormFieldVO> fieldVOList;

    @Data
    public static class FormFieldVO {
        /**
         * 字段名称
         */
        private String filedName;
        /**
         * 字段类型 1-文本 2-数字 3-时间
         */
        private Integer type;

    }
}
