package com.wuyiwen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : JCccc
 * @CreateTime : 2019/11/26
 * @Description :
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    private Integer UI_ID;
    private String UI_USER_NAME;
    private String UI_PASSWORD;
    private String UI_STATUS;
    private Long UI_CREATE_TIME;
    private String UI_ROLES;
}
