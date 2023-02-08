package com.wuyiwen.test;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.ObjectUtil;

import java.util.*;

public class app {

    public static void main(String[] args) {

//        int a =1;
//        System.out.println(~a);
//        System.out.println(~a|a);
//
//        ArrayList<String> objects = new ArrayList<>();
//        objects.add("ad");
//        objects.add("ad");
//        objects.add("ad");
//        objects.add("ad");
//
//        if (objects.size() > new Random().nextInt()) {
//            System.out.println("aaa");
//        }
//        System.out.println( "addddafa");
//        System.out.println( "addddafa");
//        System.out.println( "addddafa");

        Map<String,Object> map = new HashMap();
        map.put("id","234234");

        map.put("type","ddd");

        Long id = MapUtil.getLong(map, "id");
        Long id2 = MapUtil.getLong(map, "id2");
        String  type = MapUtil.getStr(map, "type");
        String  type2 = MapUtil.getStr(map, "type2");

        System.out.println("ddd");

        long ids = 0;
        boolean empty = ObjectUtil.isNull(ids);
        System.out.println(empty);


    }


}
