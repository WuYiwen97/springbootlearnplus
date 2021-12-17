package com.wyw;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class reflectTest {

    public static void main(String[] args) {
        People people = new People();
        Class<? extends People> aClass = people.getClass();
        System.out.println(aClass);
        String simpleName = aClass.getSimpleName();
        System.out.println(simpleName);
        Type genericSuperclass1 = aClass.getGenericSuperclass();
        System.out.println(genericSuperclass1);

        String ids = "1";
        String[] splitIds = ids.split(",");
        System.out.println(splitIds.length);

    }


}
