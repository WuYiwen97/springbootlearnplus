package com.wuyiwen.exception;

import com.wuyiwen.vo.People;

import java.io.IOException;

public class ExceptionTest {

    private String exception;

    public void fun() throws Exception {

            People people = new People();
            if (1==1) {
                try {

                } catch (Exception e) {
                    throw new Exception();

                }
            }



    }

    public static void main(String[] args)  {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.fun();
        } catch (Exception e) {
            System.out.println(2);
            e.printStackTrace();
        }
    }
}
