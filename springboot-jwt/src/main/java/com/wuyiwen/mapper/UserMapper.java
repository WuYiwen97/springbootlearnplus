package com.wuyiwen.mapper;

import com.wuyiwen.pojo.UserInfo;
import org.apache.ibatis.annotations.*;

/**
 * @Author : JCccc
 * @CreateTime : 2019/11/26
 * @Description :
 **/
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user_info WHERE UI_ID=#{userId}")
    UserInfo getUserInfoById(@Param("userId") Integer userId);

    @Select("SELECT * FROM user_info WHERE UI_USER_NAME=#{userName}")
    UserInfo getUserInfoByName(@Param("userName") String userName);

    @Insert("INSERT INTO user_info ( UI_USER_NAME, UI_PASSWORD, UI_STATUS,UI_CREATE_TIME, UI_ROLES )   VALUES ( #{UI_USER_NAME}, #{UI_PASSWORD},#{UI_STATUS},#{UI_CREATE_TIME},#{UI_ROLES}) ")
    @Options(useGeneratedKeys = true, keyProperty = "UI_ID")
    int addUser(UserInfo userInfo);
}