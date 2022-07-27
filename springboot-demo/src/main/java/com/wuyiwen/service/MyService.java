package com.wuyiwen.service;

import com.wuyiwen.util.FsnException;
import com.wuyiwen.util.Result;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    public  void fun1()  {
        int a =1 ;
        if (a ==1 ){
            throw new FsnException(new Result.Error("2020","sdfsadf"));
            //throw new RuntimeException("ddd");
        }
    }
}
