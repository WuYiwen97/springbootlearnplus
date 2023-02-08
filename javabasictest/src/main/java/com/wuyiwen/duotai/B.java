package com.wuyiwen.duotai;

public class B extends A{

    @Override
    public void aVoid() {
        super.aVoid();
        System.out.println("b");
    }


    public static void main(String[] args) {
        A b = new B();
        b.aVoid();
    }
}
