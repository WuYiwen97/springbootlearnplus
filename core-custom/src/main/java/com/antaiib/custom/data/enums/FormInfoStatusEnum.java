package com.antaiib.custom.data.enums;

/**
 * 表单信息状态枚举类
 *
 * @author yz
 * @date 2021/10/18 16:22
 */
public enum FormInfoStatusEnum {
    /**
     * 表单状态。0-启用，1-停用，2-删除
     */
    ENABLE("0", "启用"),
    DISABLE("1", "停用"),
    DELETE("2", "删除");
    private final String code;
    private final String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    FormInfoStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
