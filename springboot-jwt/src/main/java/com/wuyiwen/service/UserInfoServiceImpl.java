package com.wuyiwen.service;


import com.wuyiwen.mapper.UserMapper;
import com.wuyiwen.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : JCccc
 * @CreateTime : 2019/11/26
 * @Description :
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserInfoById(Integer userId) {
        return userMapper.getUserInfoById(userId);
    }

    @Override
    public UserInfo getUserInfoByName(String userName) {

        return userMapper.getUserInfoByName(userName);
    }

    @Override
    public int addUser(UserInfo userInfo) {
        return userMapper.addUser(userInfo);
    }
}
