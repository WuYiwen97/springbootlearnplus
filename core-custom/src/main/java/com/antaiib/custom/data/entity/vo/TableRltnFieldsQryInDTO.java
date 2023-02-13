package com.antaiib.custom.data.entity.vo;

import lombok.Data;

/**
 * 表关联配置查询字段列表的入参DTO
 *
 * @author yz
 * @since 2022/9/20 16:51
 */
@Data
public class TableRltnFieldsQryInDTO {
    /**
     * 应用程序域
     */
    private String appDomain;
    /**
     * 表名称
     */
    private String tableName;
    /**
     * 关联的表类型，0-主表，1-关联表
     */
    private String rltnTableType;
}
