package com.wuyiwen.controller;


import com.wuyiwen.Application;
import com.wuyiwen.vo.People;
import org.apache.commons.collections.SetUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MyControllerTest {
    @Autowired
    private MyController myController;


    @Test
    public void fun(){
        myController.testHoliday();
    }

    @Test
    public void fun2() throws ClassNotFoundException {
        Thread thread = Thread.currentThread();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        System.out.println(stackTrace[1].getClassName());
        String className = stackTrace[1].getClassName();
        System.out.println(Class.forName(className));
        Class.forName(className).isAnnotation();
        Arrays.stream(stackTrace).forEach(System.out::println);

    }


    @Test
    public void fun3() {
        List<People> peopleList1 = new ArrayList<>();
        People people11 = new People(1,"2");
        People people12 = new People(2,"22");
        People people13 = new People(3,"3");
        People people14 = new People(4,"4");
        People people15 = new People(4,"2");
        peopleList1.add(people11);
        peopleList1.add(people12);
        peopleList1.add(people13);
        peopleList1.add(people14);
        peopleList1.add(people15);
        Set<String> collect1 = peopleList1.stream().map(e -> e.getName()).collect(Collectors.toSet());

        List<People> peopleList2 = new ArrayList<>();
        People people21 = new People(1,"2");
        People people22 = new People(2,"2");
        People people23 = new People(3,"3");
        People people24 = new People(4,"4");
        People people25 = new People(4,"22");

        peopleList2.add(people21);
        peopleList2.add(people22);
        peopleList2.add(people23);
        peopleList2.add(people24);
        peopleList2.add(people25);
        Set<String> collect2 = peopleList2.stream().map(e -> e.getName()).collect(Collectors.toSet());
        boolean equalSet = SetUtils.isEqualSet(collect1, collect2);
        System.out.println(equalSet);


    }

}