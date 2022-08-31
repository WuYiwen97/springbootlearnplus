package com.wuyiwen.testproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    Object object;

    DynamicProxy(Object object) {
        super();
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if ("method1".equals(method.getName())) {
            System.out.println("before dynamicProxy!");
            method.invoke(object, args);
            System.out.println("before dynamicProxy!");
        } else if ("method".equals(method.getName())) {
            System.out.println("before dynamicProxy1!");
            method.invoke(object, args);
            System.out.println("before dynamicProxy1!");
        }

        return null;
    }
}