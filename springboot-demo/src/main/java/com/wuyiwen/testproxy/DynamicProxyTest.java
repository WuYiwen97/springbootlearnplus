package com.wuyiwen.testproxy;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.Properties;

public class DynamicProxyTest {
    public static void main(String[] args) throws InterruptedException, NoSuchFieldException, IllegalAccessException {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Sourceable source = new Source();
        DynamicProxy dynamicProxy = new DynamicProxy(source);
        Sourceable sourceable = (Sourceable) Proxy.newProxyInstance(Source.class.getClassLoader(), Source.class.getInterfaces(), dynamicProxy);

        sourceable.method();

        System.out.println("=========");
        sourceable.method1();
        System.out.println("=========");

        NoImplClass noImplClass = new NoImplClass();
        DynamicProxy dynamicProxy1 = new DynamicProxy(noImplClass);
        Object o =Proxy.newProxyInstance(NoImplClass.class.getClassLoader(),  new Class[]{NoImplClass.class}, dynamicProxy1);

        System.out.println();

    }
}