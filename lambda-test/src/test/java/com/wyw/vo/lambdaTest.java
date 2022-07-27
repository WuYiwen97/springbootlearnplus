package com.wyw.vo;


import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;

public class lambdaTest {

    @Test
    public void fun(){
        Consumer a = (Consumer<String>) o -> System.out.println(o);
        a.accept("asdfasf");
        Consumer b = new Consumer() {
            @Override
            public void accept(Object o) {

            }
        };
        Consumer b2 = System.out::println;


    }

    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (isInterested(random.nextInt(10))) {
                count++;
            }
        }
        System.out.printf("Found %d interested values%n", count);
    }

    private static boolean isInterested(int i) {
        return i % 2 == 0;
    }



}