package com.antaiib.custom.data.utils.format;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @projectName： fsn-base-s
 * @packageName： com.antaiib.tools.format
 * @fileName： DictionaryFormat
 * @description： 数据字典格式化注解
 * @author： zhengrt
 * @date： 2019/12/13  9:43
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE})
public @interface CustomFormat {

    /**
     * 指定翻译值存放字段, 例如:userType的翻译结果放到userTypeName上
     * @return
     */
    String destination() default "";

    /**
     *  编码
     * @return
     */
    String code() default "";

    /**
     *  是否需要应用ID，默认false，不需要
     * @return
     */
    boolean needAppId() default false;

    /**
     *  默认值
     * @return
     */
    String defaultValue() default "";

    /*
     * 关联字段，根据此字段的值给被关联字段赋值
     */
     String[] relationFields() default "";

    /*
     * 对应redis hash中存放的名称
     */
     String redisHashItem() default "";
}
