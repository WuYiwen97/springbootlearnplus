package com.wuyiwen.controller;

import com.wuyiwen.service.MyService;
import com.wuyiwen.util.FsnException;
import com.wuyiwen.utils.SpringContextUtil;
import com.wuyiwen.utils.UserAgentInterceptor;
import com.wuyiwen.vo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class MyController {

    @Autowired
    private MyService myService;


//    static {
//        System.out.println("test new mycontroller");
//    }

    @PostConstruct
    public  void fun(){
        System.out.println("test postconstruct");
    }

    @GetMapping("/test")
    public String sayHello(HttpServletRequest req, HttpServletResponse resp) {
        int a =1/0;
        return "Hello World";
    }

    @GetMapping("/test1")
    public void fun1(){
        try {
            myService.fun1();
        } catch (FsnException e) {

           // e.printStackTrace();
            System.out.println(e.getError());
        }
    }


    @GetMapping("/testthread")
    public void fun2(){
        get();

    }

    public static String get() {
        Thread thread = Thread.currentThread();

        StackTraceElement[] methodStack = Thread.currentThread().getStackTrace();
        Arrays.stream(methodStack).forEach(System.out::println);
        return "1";
    }

    @GetMapping("testHoliday")
    public void testHoliday(){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(Collections.singletonList(new UserAgentInterceptor()));
        String forEntity = restTemplate.getForObject("http://timor.tech/api/holiday/info/2022-2-8", String.class);
        System.out.println(forEntity);
    }

    public static void main(String[] args) {
        /*int num =4;
        long aa =1;
        long bb ;
        String numFormat = "cnmd20220001";
        Pattern p = Pattern.compile("^cnmd(\\d{4})(\\d{"+num+"})$");
        Matcher m = p.matcher(numFormat);

        if (!m.matches()) {
            aa = Long.parseLong(m.group(0));
            bb = Long.parseLong(m.group(1));
            System.out.println(aa+""+bb);
        }
        else {
           // aa = Long.parseLong(m.group(0));
            aa = Long.parseLong(m.group(1));
            bb = Long.parseLong(m.group(2));
            System.out.println(aa+" "+bb);
        }*/

        String numFormat = "cnmd20220001";
        String substring = numFormat.substring(numFormat.length() - 4);
        System.out.println(substring);
    }






}
