package com.antaiib.custom.param.v3;



import lombok.Data;

/**
 * @fileName： SaveParam
 * @author： fuht
 * @date： 2021/9/16 09:52
 */
@Data
/**
  * 自定义数据表数据保存数据源接口入参
 */
public class SaveParam {

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

    /**
  * 更新标示
 */
    private String updateMark = "id";

    /**
  * 关联字段值
 */
    private Object rltnFieldValue;
}
