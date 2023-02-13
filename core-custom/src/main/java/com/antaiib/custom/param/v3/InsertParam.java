package com.antaiib.custom.param.v3;



import lombok.Data;

/**
 * @fileName： InsertParam
 * @author： fuht
 * @date： 2021/9/15 10:53
 */
@Data
/**
  * 自定义数据表数据插入数据源接口入参
 */
public class InsertParam {

    /**
  * 是否是主表
 */
    private Boolean isPrimaryTable;

    /**
  * 自定义数据表表名
 */
    private String tableName;

    /**
  * 表单数据
 */
    private Object formData;
}
