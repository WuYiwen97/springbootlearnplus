package com.wyw;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.*;

public class reflectTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
//        People people = new People(12,"aa");
//        Class<? extends People> aClass = people.getClass();
//        System.out.println(aClass);
//        String simpleName = aClass.getSimpleName();
//        System.out.println(simpleName);
//        Type genericSuperclass1 = aClass.getGenericSuperclass();
//        System.out.println(genericSuperclass1);
//
//        Class<People> clazz = People.class;
//        People obj = clazz.newInstance();
//        System.out.println(obj);
        Map<String, Object> deleteClassifyMap = new HashMap<>(500);
        deleteClassifyMap.put(null,"1");

        System.out.println(deleteClassifyMap.get(null));

        String name = null;
        People people1 = new People();
        Field[] fields = People.class.getDeclaredFields();

        PropertyDescriptor propertyDescriptor = BeanUtils.getPropertyDescriptor(People.class, "name");
        try {
            propertyDescriptor.getWriteMethod().invoke(people1, name);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        String name1 = people1.getName();
        System.out.println(name1);




    }


}
