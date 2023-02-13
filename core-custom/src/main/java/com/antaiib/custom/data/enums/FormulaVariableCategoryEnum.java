package com.antaiib.custom.data.enums;

/**
 * 公式变量分类枚举类
 *
 * @author yz
 * @date 2021/11/04 16:22
 */
public enum FormulaVariableCategoryEnum {
    /**
     * 分类。1-组织机构分类，2-日期时间分类。
     */
    ORGANIZATION(1, "组织机构分类"),
    DATETIME(2, "日期时间分类"),
    OTHER(0, "");
    private final Integer code;
    private final String name;

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    FormulaVariableCategoryEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(Integer code){
        for (FormulaVariableCategoryEnum categoryEnum : FormulaVariableCategoryEnum.values()) {
            if (categoryEnum.getCode().equals(code)) {
                return categoryEnum.getName();
            }
        }
        return OTHER.getName();
    }
}
