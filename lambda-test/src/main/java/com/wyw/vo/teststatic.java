package com.wyw.vo;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class teststatic {
    static String a = "a";

    public static void setA(String a) {
        teststatic.a = a;
    }

    public static void main(String[] args) {
        Set<Long> set1= new HashSet<>();
        set1.add(1L);
        set1.add(2L);
        set1.add(3L);
        set1.add(4L);
        set1.add(5L);
        Set<Long> set2= new HashSet<>();
        set2.add(2L);
        set2.add(3L);
        set2.add(4L);
        set1.forEach(System.out::print);
        System.out.println("\n");
        set2.forEach(System.out::print);
        System.out.println("\n");

        set1.removeAll(set2);
        set1.forEach(System.out::print);
        System.out.println("\n");


        String collect = set1.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(collect);
    }






}
