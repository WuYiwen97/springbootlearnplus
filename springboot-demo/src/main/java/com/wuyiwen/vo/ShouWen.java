package com.wuyiwen.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;


@Data
@ToString
public class ShouWen {

    private Date createTime;
    private Date updateTime;
    private String createId;
    private String updateId;

    private String shouWenUser;
}
