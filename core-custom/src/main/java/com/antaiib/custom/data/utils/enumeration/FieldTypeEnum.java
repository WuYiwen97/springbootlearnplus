package com.antaiib.custom.data.utils.enumeration;

/**
 * @projectName： fsn-base-s
 * @packageName： com.antaiib.custom.utils.enumeration
 * @fileName： FieldTypeEnum
 * @description： 字段类型枚举类
 * @author： zhengrt
 * @date： 2020/6/9  11:36
 */
public enum FieldTypeEnum {
    UNKNOWN(0, "未知"),
    BIGINT(1, "整型"),
    INT(11, "int"),
    TINYINT(12, "tinyint"),
    DECIMAL(2, "浮点型"),
    FLOAT(21, "float"),
    DOUBLE(22, "double"),
    VARCHAR(3, "字符型"),
    CHAR(31, "char"),
    LONGTEXT(4, "文本型"),
    TINYTEXT(41, "tinytext"),
    TEXT(42, "text"),
    MEDIUMTEXT(43, "mediumtext"),
    TIMESTAMP(5, "timestamp"),
    DATETIME(51, "datetime"),
    DATE(52, "date"),
    TIME(53, "time"),
    YEAR(54, "year"),
    BLOB(7, "blob"),
    LONGBLOB(71, "longblob");
    private Integer code;
    private String name;

    FieldTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }
    public String getName() {
        return this.name;
    }

    public static int getIndex(String name) {
        FieldTypeEnum[] fieldTypeEnums = FieldTypeEnum.values();
        for (FieldTypeEnum fieldTypeEnum : fieldTypeEnums) {
            if (name.equals(fieldTypeEnum.getName())) {
                return fieldTypeEnum.getCode();
            }
        }
        return 3;//默认返回字符型
    }

    public static String getNameByCode(Integer code){
        for (FieldTypeEnum fieldTypeEnum : FieldTypeEnum.values()) {
            if (fieldTypeEnum.getCode().equals(code)) {
                return fieldTypeEnum.getName();
            }
        }
        return UNKNOWN.getName();
    }


}
