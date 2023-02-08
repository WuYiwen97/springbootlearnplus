package com.wuyiwen.collection;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> dd = CollectionUtil.newArrayList("dd","dd2");
        System.out.println(dd);

        String a = ",";
        String b = "";
        String c = ",3,4";
        String d = null;
        List<String> split1 = StrUtil.split(a, ",", -1, true, true);
        List<String> split2 = StrUtil.split(b, ",", -1, true, true);
        List<String> split3 = StrUtil.split(c, ",", -1, true, true);
        List<String> split4 = StrUtil.split(d, ",", -1, true, true);
        System.out.println("1");

        List<String>  rltnCodes = new ArrayList<>();
        rltnCodes.add("sadfasd");
        rltnCodes.add("sadf");
        rltnCodes.add("fasdf");
        rltnCodes.add("fasdf");


        rltnCodes = rltnCodes.stream().map(e->e="'"+e+ "'").collect(Collectors.toList());
        String rltnCodeString = StringUtils.strip(rltnCodes.toString(), "[]");
        System.out.println(rltnCodeString);

        fun("a");
        fun("a","a");

        rltnCodes.addAll(null);



    }

//    public static void fun(String a) {
//
//    }
    public static void fun(String a,String... c) {

    }

}
