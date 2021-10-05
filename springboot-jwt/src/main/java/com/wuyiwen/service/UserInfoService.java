package com.wuyiwen.service;


import com.wuyiwen.pojo.UserInfo;

/**
 * @Author : JCccc
 * @CreateTime : 2019/11/26
 * @Description :
 **/

public interface UserInfoService {

    UserInfo getUserInfoById(Integer userId);

    UserInfo getUserInfoByName( String userName);

    int addUser(UserInfo User);
}