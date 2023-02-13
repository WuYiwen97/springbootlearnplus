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
public class CustomTypeConfigVO {
    /**
     * 表类型 0-树表 1-数据表
     */
    private Integer tableType;
    /**
     * 类别编码
     */
    private String customTypeCode;
    /**
     * 类别名称
     */
    private String customTypeName;
    /**
     * 类别描述
     */
    private String customTypeDescription;

    /**
     * 基础类别编码
     */
    private String enumValue;
    /**
     * 树层级关联基础类型值
     */
    private String enumRltnValue;
    /**
     * 场景编码
     */
    private String sceneCode;
    /**
     * 关联编码
     */
    private String rltnCode;

    /**
     * 类别配置关联类型 1-拓展 2-拓展从表
     */
    private Integer configRltnType;
    /**
     * 关联表表名
     */
    private String foreignTableName;
    /**
     * 关联表显示名
     */
    private String foreignTableDesName;
    /**
     * 关联表内字段的字段编码
     */
    private String fieldConfig;
}
