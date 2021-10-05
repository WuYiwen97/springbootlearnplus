package com.wuyiwen.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常捕获
 */

@ControllerAdvice
public class GlobalHandlerExceptionResolver {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> allExceptionHandler(Exception e) {
        System.out.println("================进入异常处理================");
        Map<String,Object> map = new HashMap<>();
        map.put("errorCode",500);
        map.put("errorMsg",e.toString());
        return  map;
    }
}

