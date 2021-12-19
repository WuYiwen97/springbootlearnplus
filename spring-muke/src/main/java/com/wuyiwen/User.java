package com.wuyiwen;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class User {

private Integer id;
private String name;
private Object []array;
private List list;
private Map map;
//省略get和set方法

}
