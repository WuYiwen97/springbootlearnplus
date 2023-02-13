package com.antaiib.custom.commons.annotation;

import org.springframework.stereotype.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 当前实现类可适用的表级别
 *
 * @author yz
 * @since 2022/12/28 17:07
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Service
public @interface ApplicableTableLevels {
    /**
     * @return {@link TableLevelEnum[]}
     */
    LevelEnum[] value();

    /**
     * 实现类可适用的表级别枚举类（目前只有两种，系统级和应用级）
     *
     * @author yz
     */
    enum LevelEnum {
        /**
         * 等级：1-系统级、3-应用级
         */
        SYS(1, "系统级"),
        APP(3, "应用级");
        private final Integer code;
        private final String name;

        public Integer getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        LevelEnum(Integer code, String name) {
            this.code = code;
            this.name = name;
        }
    }

}
