package com.antaiib.custom.data.enums;

import java.util.Arrays;
import java.util.Optional;

/**
 * 数据表类型
 * @author panyc
 * @date 2021/12/07 17:35
 */
public enum CustmoTableTypeEnum {
    /**
     * 数据表类型 0：普通数据表，1：树状数据表，2：动态属性表
     */
    GENERAL_TABLE(0, "普通数据表"),
    TREE_TABLE(1, "树状数据表"),
    DYNAMIC_PROP_TABLE(2, "动态属性表"),
    ENTITY_TAG_RLTN_TABLE(3, "实体测点关联表");
    private final Integer code;
    private final String name;

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    CustmoTableTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static Optional<CustmoTableTypeEnum> getTableTypeEnumByCode(int code){
        return Arrays.stream(CustmoTableTypeEnum.values()).filter(c -> c.getCode().equals(code)).findFirst();
    }
}
