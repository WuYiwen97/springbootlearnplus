package com.antaiib.custom.param.v3;



import lombok.Data;

/**
 * @projectName： fsn-base-s
 * @packageName： com.antaiib.custom.param
 * @fileName： DeleteParam
 * @description： TODO
 * @author： zhengrt
 * @date： 2021/2/26  17:52
 */
@Data
/**
  * 自定义数据表数据删除数据源接口入参
 */
public class DeleteParam {

    /**
  * 自定义数据表表名
 */
    private String tableName;

    /**
  * 表单数据
 */
    private Object formData;
}
