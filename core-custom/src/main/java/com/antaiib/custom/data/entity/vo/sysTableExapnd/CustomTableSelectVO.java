package com.antaiib.custom.data.entity.vo.sysTableExapnd;

import lombok.Data;

/**
 * 数据表下拉选VO类
 *
 * @author yz
 * @since 2022/8/9 15:25
 */
@Data
public class CustomTableSelectVO {
    /**
     * 数据表id
     */
    private Long id;
    /**
     * 编码
     */
    private String tableCode;
    /**
     * 表描述名称
     */
    private String tableDesname;
    /**
     * 表名称
     */
    private String tableName;
    /**
     * 表所在数据库
     */
    private String appDomain;
    /**
     * 数据表类型，0：普通数据表，1：树状数据表
     */
    private Integer tableType;
    /**
     * 所属模块名称
     */
    private String moduleName;
}
