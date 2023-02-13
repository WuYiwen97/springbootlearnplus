package com.antaiib.custom.data.enums;

/**
 * 瞬时量派生类型枚举
 *
 * @author yz
 * @since 2022/12/22 10:27
 */
public enum InstantDeriveTagTypeEnum {

    /**
     * 瞬时量派生类型枚举
     */
    HOURMAXIMUM("1XH", "瞬时量时最大值"),
    HOURMINIMUM("1NH", "瞬时量时最小值"),
    HOURAVERAGE("1AH", "瞬时量时平均值"),
    DAYMAXIMUM("1XD", "瞬时量日最大值"),
    DAYMINIMUM("1ND", "瞬时量日最小值"),
    DAYAVERAGE("1AD", "瞬时量日平均值"),
    MONTHMAXIMUM("1XM", "瞬时量月最大值"),
    HMONTHMINIMUM("1NM", "瞬时量月最小值"),
    MONTHAVERAGE("1AM", "瞬时量月平均值"),
    QUARTERMAXIMUM("1XQ", "瞬时量季最大值"),
    QUARTERMINIMUM("1NQ", "瞬时量季最小值"),
    QUARTERAVERAGE("1AQ", "瞬时量季平均值"),
    YEARMAXIMUM("1XY", "瞬时量年最大值"),
    YEARMINIMUM("1NY", "瞬时量年最小值"),
    YEARAVERAGE("1AY", "瞬时量年平均值");

    private String value;
    private String name;

    InstantDeriveTagTypeEnum(String value, String name) {
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
        for (InstantDeriveTagTypeEnum typeEnum : InstantDeriveTagTypeEnum.values()) {
            if (typeEnum.getValue().equals(code)) {
                return typeEnum.getName();
            }
        }
        return null;
    }

}
