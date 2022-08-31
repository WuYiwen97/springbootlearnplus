package com.wuyiwen.service;

import com.wuyiwen.util.FsnException;
import com.wuyiwen.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
@EnableAspectJAutoProxy
public class MyService {

    public  void fun1()  {
        int a =1 ;
        if (a ==1 ){
            throw new FsnException(new Result.Error("2020","sdfsadf"));
            //throw new RuntimeException("ddd");
        }
    }
}
