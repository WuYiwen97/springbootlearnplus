package com.antaiib.custom.param.v3;



import lombok.Data;

/**
 * @projectName： fsn-base-s
 * @packageName： com.antaiib.custom.param
 * @fileName： ShowParam
 * @description：
 * @author： zhengrt
 * @date： 2021/2/26  15:29
 */
@Data
/**
  * 自定义数据表展示数据源接口入参
 */
public class ShowParam {

    /**
  * 自定义数据表表名
 */
    private String tableName;

    /**
  * 初始条件
 */
    private String initConditions;

    /**
  * 初始参数，用于字段内容的初始化提供参数
 */
    private String initParameters;

    /**
  * 自定义Sql编码
 */
    private String customSqlCode;

    /**
  * 排序参数
 */
    private String orderParas;

    /**
  * 页码
 */
    private int pageNum = 1;

    /**
  * 每页显示的数据条数
 */
    private int pageSize = 5;

    /**
  * 选择输入类字段是否转化，默认1，需要
 */
    private int fieldConversion = 1;

    /**
  * 是否使用关联
 */
    private boolean isUseRelation;

    /**
  * 关联表名，多个以,隔开
 */
    private String rltnTableNames;

    /**
  * 是否使用精确查询
 */
    private boolean accurateQueryFlag = false;

    /**
     * 动态权限开关
     */
    private boolean dynamicPermissionsFlag = true;

    /**
     * 是否显示通用数据
     */
    private boolean showGeneralData = false;

    public boolean getIsUseRelation() {
        return isUseRelation;
    }

    public void setIsUseRelation(boolean useRelation) {
        isUseRelation = useRelation;
    }
}
