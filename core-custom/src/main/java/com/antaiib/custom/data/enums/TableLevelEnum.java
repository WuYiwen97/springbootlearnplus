package com.antaiib.custom.data.enums;

/**
 * 表级别枚举类
 *
 * @author yz
 * @date 2021/8/26 16:22
 */
public enum TableLevelEnum {
    /**
     * 等级：1-系统级、2-行业级、3-应用级
     */
    SYS(1, "系统级"),
    IDU(2, "行业级"),
    APP(3, "应用级");
    private final Integer code;
    private final String name;

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    TableLevelEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
