
package com.wuyiwen.dao;

import lombok.Data;

import java.io.Serializable;

@Data
public class Account implements Serializable {
    //数据id
    private Integer id;
    //账号编码
    private String accountNum;
    //账号金额
    private Float money;
    //省略 get 和 set 的方法

}
