package com.wuyiwen.service.impl;

import com.wuyiwen.aop.Syslog;
import com.wuyiwen.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Syslog(detail = "111")
    @Override
    public String findUserName(String tel) {
        System.out.println("tel:" + tel);
        return "zhangsan";
    }
}
