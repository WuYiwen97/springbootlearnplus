package com.antaiib.custom.data.entity.vo;

import lombok.Data;

/**
 * @ProjectName: 20211206-sxjxq-springcloudalibab
 * @Package: com.antaiib.custom.data.entity.vo
 * @ClassName: BaseTypeConfigVO
 * @Description:
 * @Author: wangth
 * @CreateDate: 2021/12/8 21:19
 * @UpdateUser:
 * @UpdateDate:
 * @UpdateRemark:
 */
@Data
public class BaseTypeConfigVO {
    /**
     * 关联编码
     */
    private String rltnCode;

    /**
     * 类别配置关联类型 1-拓展 2-拓展从表
     */
    private Integer configRltnType;
    /**
     * 数据表关联类型 1:一对一  2:一对多  3:多对多
     */
    private String tableRltnType;
    /**
     * 关联表ID
     */
    private Long foreignTableId;
    /**
     * 关联表显示名称
     */
    private String foreignTableDesname;
    /**
     * 关联表表名
     */
    private String foreignTableName;
    /**
     * 关联表内字段的字段编码
     */
    private String fieldCode;
    /**
     * 关联表内字段的字段名称
     */
    private String fieldName;
}
