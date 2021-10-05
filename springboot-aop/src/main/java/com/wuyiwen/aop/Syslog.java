package com.wuyiwen.aop;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Syslog {

    String detail() default "";

    //这里可以多加几个参数
}
