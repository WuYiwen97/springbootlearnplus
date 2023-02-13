package com.antaiib.custom.data.enums;

/**
 * @author zhangzr
 * @date 2022-05-26 17:22
 * 模块状态枚举
 **/
public enum CustomModuleStatusEnum {
    /**
     * 模块禁用
     */
    DISABLE(0, "禁用"),
    /**
     * 模块启用
     */
    ENABLE(1, "启用");

    private Integer code;
    private String name;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    CustomModuleStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
