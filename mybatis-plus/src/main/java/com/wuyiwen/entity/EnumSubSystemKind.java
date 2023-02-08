package com.wuyiwen.entity;

/***
 * 业务子系统类型
 * @author lijingyi
 * @date 2022-05-20
 */
public enum EnumSubSystemKind {
    /***
     * 1 电子校徽
     */
    ElecLogo(1, "电子校徽"),

    /***
     * 2 电子班牌
     */
    ElecClassCard(2, "电子班牌"),

    /***
     * 3 宿舍考勤
     */
    DormitoryAttendance(3, "宿舍考勤"),

    /***
     * 4 门禁系统
     */
    Guard(4, "门禁系统"),

    /***
     * 5 消费系统
     */
    ConsumingSystem(5, "消费系统"),
    /***
     * 6 主要通行区
     */
    MainPassArea(6, "主要通行区");

    /**
     * 编码
     */
    private final Integer code;

    /**
     * 名称
     */
    private final String name;

    EnumSubSystemKind(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    /**
     * 根据编码获取枚举
     * <br/>
     *
     * @param code 编码
     * @return java.lang.String
     * @author lbc
     * @date 2022/04/27 18:03
     */
    public static EnumSubSystemKind getEnum(Integer code) {
        EnumSubSystemKind[] enums = EnumSubSystemKind.values();
        for (EnumSubSystemKind e : enums) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }

    /**
     * 根据编码获取名称
     * <br/>
     *
     * @param code 编码
     * @return java.lang.String
     * @author lbc
     * @date 2022/04/27 18:03
     */
    public static String getName(Integer code) {
        EnumSubSystemKind[] enums = EnumSubSystemKind.values();
        for (EnumSubSystemKind e : enums) {
            if (e.getCode().equals(code)) {
                return e.getName();
            }
        }
        return null;
    }

    /**
     * 根据名称获取编码
     * <br/>
     *
     * @param name 名称
     * @return java.lang.String
     * @author lbc
     * @date 2022/04/27 18:03
     */
    public static Integer getCode(String name) {
        EnumSubSystemKind[] enums = EnumSubSystemKind.values();
        for (EnumSubSystemKind e : enums) {
            if (e.getName().equals(name)) {
                return e.getCode();
            }
        }
        return null;
    }

    /***
     * 获取填值样例
     * @param values 内容
     * @return String
     */
    public static String getSample(EnumSubSystemKind... values) {
        StringBuilder sample = new StringBuilder();
        sample.append("[ ");
        EnumSubSystemKind[] enums;
        if (values == null || values.length == 0) {
            enums = EnumSubSystemKind.values();
        } else {
            enums = values;
        }
        for (int i = 0; i < enums.length; i++) {
            EnumSubSystemKind e = enums[i];
            sample.append(e.getCode());
            sample.append(" : ");
            sample.append(e.getName());
            if (i < enums.length - 1) {
                sample.append(", ");
            }
        }
        sample.append(" ]");
        return sample.toString();
    }
}
