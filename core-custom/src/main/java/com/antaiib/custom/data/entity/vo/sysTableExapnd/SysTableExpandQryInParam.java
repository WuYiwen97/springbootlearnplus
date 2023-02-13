package com.antaiib.custom.data.entity.vo.sysTableExapnd;

import lombok.Data;

/**
 * 系统表扩展配置查询入参
 *
 * @author yz
 * @since 2022/8/8 20:23
 */
@Data
public class SysTableExpandQryInParam {
    /**
     * 关联编码
     */
    private String rltnCode;
    /**
     * 主表名称
     */
    private String primaryTableName;
    /**
     * 外表名称
     */
    private String foreignTableName;
    /**
     * 页码
     */
    private Integer pageNumber = 1;
    /**
     * 页大小
     */
    private Integer pageSize = 10;
}
