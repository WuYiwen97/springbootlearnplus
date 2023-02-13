package com.antaiib.custom.data.enums;

/**
 * 字段标识类型
 *
 * @author panyc
 * @date 2021/12/07 17:42
 */
public enum CustmoFieldFlagEnum {
    /**
     * 字段标识类型 1：编码字段，2：预设字段，3：普通字段
     */
    CODE_FIELD(1, "编码字段"),
    PRESET_FIELD(2, "预设字段"),
    GENERAL_FIELD(3, "普通字段"),
    LOGICAL_DELETION_FIELD(4,"逻辑删除标识字段");
    private final Integer code;
    private final String name;

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    CustmoFieldFlagEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
