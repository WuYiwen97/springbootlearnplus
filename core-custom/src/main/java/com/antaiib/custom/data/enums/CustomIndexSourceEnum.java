package com.antaiib.custom.data.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 自定义表索引来源枚举
 *
 * @author yz
 * @since 2022/09/20 20:12
 */
@AllArgsConstructor
@Getter
public enum CustomIndexSourceEnum {

    /**
     * 用户添加
     */
    USER_ADD(0, "用户手动添加"),
    /**
     * 系统添加
     */
    SYSTEM_ADD_CODE(1, "系统自动添加（编码字段）");
    /**
     * 编码
     */
    private final Integer code;
    /**
     * 名称
     */
    private final String name;
}
