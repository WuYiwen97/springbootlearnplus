package com.antaiib.custom.data.enums;

import java.util.Arrays;

public enum CustmoTableIndexTypeEnum {
    /**
     * 索引类型 0：唯一索引，1：普通索引，2：全文索引
     */
    UNIQUE(0, "唯一索引"),
    NORMAL(1, "普通索引"),
    FULLTEXT(2, "全文索引"),
    UNKNOWN(-1, "未知类型");
    private final Integer code;
    private final String name;

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    CustmoTableIndexTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static CustmoTableIndexTypeEnum getEnumByCode(int code){
        return Arrays.stream(CustmoTableIndexTypeEnum.values())
                .filter(c -> c.getCode() == code)
                .findFirst()
                .orElse(UNKNOWN);
    }
}
