package com.antaiib.custom.data.utils.enumeration;

/**
 * @projectName： fsn-base-s
 * @packageName： com.antaiib.custom.utils.enumeration
 * @fileName： FieldTypeEnum
 * @description： 基础字段枚举类
 * @author： zhengrt
 * @date： 2020/6/9  11:36
 */
public enum BasicFieldEnum {
    id("主键"),
    create_time("创建时间"),
    update_time("更新时间"),
    create_id("创建者ID"),
    update_id("更新者ID"),
    belong_info("所属信息"),
    source("来源"),
    app_id("应用ID");

    private String name;

    BasicFieldEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static int getIndex(String name) {
        BasicFieldEnum[] fieldTypeEnums = BasicFieldEnum.values();
        for (BasicFieldEnum fieldTypeEnum : fieldTypeEnums) {
            if (name.equals(fieldTypeEnum.getName())) {
                return fieldTypeEnum.ordinal();
            }
        }
        return -1;
    }


    public static int getIndexByField(String field) {
        BasicFieldEnum[] fieldTypeEnums = BasicFieldEnum.values();
        for (BasicFieldEnum fieldTypeEnum : fieldTypeEnums) {
            if (field.equalsIgnoreCase(fieldTypeEnum.toString())) {
                return fieldTypeEnum.ordinal();
            }
        }
        return -1;
    }


}
