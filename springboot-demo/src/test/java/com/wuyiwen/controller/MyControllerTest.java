package com.wuyiwen.controller;


import cn.hutool.core.map.MapUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import v.DfsUserFileInfoVO;
import v.People;
import org.apache.commons.collections.SetUtils;
import org.jeasy.random.EasyRandom;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

//@SpringBootTest(classes = Application.class)
//@RunWith(SpringJUnit4ClassRunner.class)
public class MyControllerTest {
    @Autowired
    private MyController myController;


    @Test
    public void fun() {
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
        People people11 = new People(1, "2");
        People people12 = new People(2, "22");
        People people13 = new People(3, "3");
        People people14 = new People(4, "4");
        People people15 = new People(4, "2");
        peopleList1.add(people11);
        peopleList1.add(people12);
        peopleList1.add(people13);
        peopleList1.add(people14);
        peopleList1.add(people15);
        Set<String> collect1 = peopleList1.stream().map(e -> e.getName()).collect(Collectors.toSet());

        List<People> peopleList2 = new ArrayList<>();
        People people21 = new People(1, "2");
        People people22 = new People(2, "2");
        People people23 = new People(3, "3");
        People people24 = new People(4, "4");
        People people25 = new People(4, "22");

        peopleList2.add(people21);
        peopleList2.add(people22);
        peopleList2.add(people23);
        peopleList2.add(people24);
        peopleList2.add(people25);
        Set<String> collect2 = peopleList2.stream().map(e -> e.getName()).collect(Collectors.toSet());
        boolean equalSet = SetUtils.isEqualSet(collect1, collect2);
        System.out.println(equalSet);


    }


    @Test
    public void fun5() {
        //发文 附件 转正文附件
        String getReceiveAccessoryFile = "[{\"name\":\"??????-????.docx\",\"id\":2295011000002392,\"path\":\"group1/M00/01/AF/wKgiSGLWAZiAUQ4sABxOkUvNLMw00.docx\"},{\"name\":\"??????-????.docx\",\"id\":2295011000002393,\"path\":\"group1/M00/01/AF/wKgiSGLWAZiAUQ4sABxOkUvNLMw00.docx\"},{\"name\":\"??????-????.docx\",\"id\":2295011000002394,\"path\":\"group1/M00/01/AF/wKgiSGLWAZiAUQ4sABxOkUvNLMw00.docx\"}]";
        Gson gson = new Gson();
        List<Map<String, Object>> attrList = gson.fromJson(getReceiveAccessoryFile, new TypeToken<List<Map<String, String>>>() {
        }.getType());
        List<Long> idList = attrList.stream().map(e -> MapUtil.getLong(e, "id")).collect(Collectors.toList());

        System.out.println(idList);

        List<DfsUserFileInfoVO> dfsUserFileInfoVOS =  new ArrayList<>();
        List<DfsUserFileInfoVO> dfsUserFileInfoVOS2 =  new ArrayList<>();
        DfsUserFileInfoVO person1 = new EasyRandom().nextObject(DfsUserFileInfoVO.class);
        DfsUserFileInfoVO person2 = new EasyRandom().nextObject(DfsUserFileInfoVO.class);
        DfsUserFileInfoVO person3 = new EasyRandom().nextObject(DfsUserFileInfoVO.class);
        DfsUserFileInfoVO person4 = new EasyRandom().nextObject(DfsUserFileInfoVO.class);
        DfsUserFileInfoVO person5 = new EasyRandom().nextObject(DfsUserFileInfoVO.class);
        dfsUserFileInfoVOS.add(person1);
        dfsUserFileInfoVOS.add(person2);
        dfsUserFileInfoVOS.add(person3);
        dfsUserFileInfoVOS.add(person4);
        dfsUserFileInfoVOS.add(person5);
        dfsUserFileInfoVOS.stream().forEach(System.out::println);
        List<Map<String,Object>> mapList = new ArrayList<>();
        dfsUserFileInfoVOS.stream().forEach(e-> {
            HashMap<String, Object> objectObjectHashMap = new HashMap<>();
            objectObjectHashMap.put("name",e.getName());
            objectObjectHashMap.put("id",e.getId());
            objectObjectHashMap.put("path",e.getPath());
            mapList.add(objectObjectHashMap);
        });
        String s = gson.toJson(mapList);

        System.out.println(s);

    }


    @Test
    public void test6() {
        WeakHashMap weakHashMap = new WeakHashMap();

    }

}