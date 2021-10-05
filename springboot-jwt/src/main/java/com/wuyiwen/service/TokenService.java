package com.wuyiwen.service;


import com.wuyiwen.pojo.UserInfo;

import java.util.Date;

/**
 * @Author : JCccc
 * @CreateTime : 2019/11/27
 * @Description :
 **/
public interface TokenService {

    public String getToken(UserInfo userInfo, Date date);
}