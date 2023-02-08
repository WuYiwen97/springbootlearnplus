package com.wuyiwen.collection;

public class TestException {

    public void fun() {
        try {
        if (1>0) {

                throw new Exception("ddfasdf");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }



    }


    public static void main(String[] args) {
        TestException testException = new TestException();
        testException.fun();
    }
}
