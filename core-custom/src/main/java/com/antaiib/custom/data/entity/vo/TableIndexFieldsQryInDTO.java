package com.antaiib.custom.data.entity.vo;

import lombok.Data;

/**
 * 索引配置查询字段列表的入参DTO
 *
 * @author yz
 * @since 2022/9/20 16:51
 */
@Data
public class TableIndexFieldsQryInDTO {
    /**
     * 表名称
     */
    private String tableName;
    /**
     * 应用程序域
     */
    private String appDomain;
    /**
     * 索引类型
     * {@link com.antaiib.custom.data.enums.CustmoTableIndexTypeEnum}
     */
    private Integer indexType;
}
