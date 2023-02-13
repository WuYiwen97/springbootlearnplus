package com.antaiib.custom.data.enums;

/**
 * 累计量派生类型
 *
 * @author yz
 * @since 2022/12/22 10:27
 */
public enum CumulativeDeriveTagTypeEnum {

    /**
     * 派生测点
     */
    HOUR("1H", "小时统计测点"),
    DAY("1D", "日统计测点"),
    MONTH("1M", "月统计测点"),
    QUARTER("1Q", "季统计测点"),
    YEAR("1Y", "年统计测点");

    private String value;
    private String name;

    CumulativeDeriveTagTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    /**
     * 通过value 获取name
     *
     * @param value
     * @return
     */
    public static String getTypeName(Object value) {
        String code = String.valueOf(value);
        for (CumulativeDeriveTagTypeEnum typeEnum : CumulativeDeriveTagTypeEnum.values()) {
            if (typeEnum.getValue().equals(code)) {
                return typeEnum.getName();
            }
        }
        return null;
    }

}
