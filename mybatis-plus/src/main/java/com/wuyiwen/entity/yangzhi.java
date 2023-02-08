package com.wuyiwen.entity;

import lombok.Data;

@Data
public class yangzhi {
    private int age;
    private String name;

    static {
        System.out.println("111111");
        int a =2;
    }
}
