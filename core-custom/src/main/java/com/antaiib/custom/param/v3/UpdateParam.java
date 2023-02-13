package com.antaiib.custom.param.v3;



import lombok.Data;

/**
 * @fileName： UpdateParam
 * @author： fuht
 * @date： 2021/9/15 10:52
 */
@Data
/**
  * 自定义数据表数据更新数据源接口入参
 */
public class UpdateParam {

    /**
  * 是否是主表
 */
    private Boolean isPrimaryTable = false;

    /**
  * 自定义数据表表名
 */
    private String tableName;

    /**
  * 表单数据
 */
    private Object formData;

    /**
  * 更新标示
 */
    private String updateMark = "id";

}
