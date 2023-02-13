package com.antaiib.custom.data.enums;

/**
 * 原始测点类型枚举
 *
 * @author yz
 * @since 2023/1/9 16:46
 */
public enum OriginalTagTypeEnum {
    /**
     * 模拟量、离散量、字符量原始测点类型
     */
    MOCK("1O", "模拟量"),
    DISCRETE("2O", "离散量"),
    CHARACTER("3O", "字符量");
    private final String code;
    private final String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    OriginalTagTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
