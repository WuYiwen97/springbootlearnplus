package com.wuyiwen.testproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyDemonstration {
 
    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(
                Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("before dynamicProxy!");
                        return "cnmd";
                    }

                });
 
        System.out.println("动态代理对象的类型："+subject.getClass().getName());
        System.out.println("===============");
        String hello = subject.SayHello("jiankunking");
        String s = subject.SayGoodBye();
        System.out.println("heelo="+hello);
        System.out.println("s="+s);
    }
}
 
