package com.wyw;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class reflectTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        People people = new People(12,"aa");
        Class<? extends People> aClass = people.getClass();
        System.out.println(aClass);
        String simpleName = aClass.getSimpleName();
        System.out.println(simpleName);
        Type genericSuperclass1 = aClass.getGenericSuperclass();
        System.out.println(genericSuperclass1);

        String ids = "1";
        String[] splitIds = ids.split(",");
        System.out.println(splitIds.length);

        Class<People> clazz = People.class;
        People obj = clazz.newInstance();
        System.out.println(obj);

    }


}
