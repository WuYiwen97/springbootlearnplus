package com.wuyiwen;

import com.wuyiwen.framework.SpringContext;
import com.wuyiwen.framework.XmlSpringContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {


    public static void main(String agrs[]) {
        //初始化容器（读取配置文件 构建工厂）
        SpringContext context =
                new XmlSpringContext("myApplicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.deleteById(1);
        System.out.println(userService.getUserDao());




    }


}
