package com.antaiib.custom.data.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

/**
 * 表关联类型枚举类
 *
 * @author yz
 * @since 2022/08/22 11:32
 */
@AllArgsConstructor
@Getter
public enum CustomTableRltnTypeEnum {
    /**
     * 一对一关联
     */
    ONE_ONE_RLTN("1", "一对一关联"),
    /**
     * 一对多关联
     */
    ONE_N_RLTN("2", "一对多关联"),
    /**
     * 多对多关联
     */
    M_N_RLTN("3", "多对多关联");
    /**
     * 编码
     */
    private final String code;

    /**
     * 名称
     */
    private final String name;

    public static Optional<CustomTableRltnTypeEnum> getRltnTypeEnum(String code){
        return Arrays.stream(CustomTableRltnTypeEnum.values()).filter(c -> c.getCode().equals(code)).findFirst();
    }
}
