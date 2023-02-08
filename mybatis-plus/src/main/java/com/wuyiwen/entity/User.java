package com.wuyiwen.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    static {
        System.out.println("111111");
        int a =2;
    }

    public static void main(String[] args) {
        User user = new User();
        System.out.println("c");
    }
}