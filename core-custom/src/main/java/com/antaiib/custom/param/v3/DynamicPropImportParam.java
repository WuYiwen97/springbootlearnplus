package com.antaiib.custom.param.v3;


import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 动态属性导入入参
 *
 * @author yz
 * @since 2022/12/08 14:26
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DynamicPropImportParam extends EasyExcelImportParam {
    /**
     * 主表名称（此处为实体表的表名，父类的tableName属性为实际要导入的表名）
     */
    private String primaryTableName;
}
