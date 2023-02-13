package com.antaiib.custom.data.enums;

public enum CustmoFieldNotNullEnum {
    /**
     * 字段必填 0：否，1：是
     */
    NULL(0, "否"),
    NOT_NULL(1, "是");
    private final Integer code;
    private final String name;

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    CustmoFieldNotNullEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
