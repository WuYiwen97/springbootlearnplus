package com.antaiib.custom.data.entity.vo.sysTableExapnd;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 系统表扩展配置入参
 *
 * @author yz
 * @since 2022-08-09 10:20:27
 */
@Data
@Accessors(chain = true)
public class SysTableExpandConfInParam implements Serializable {
    private static final long serialVersionUID = 113066799772688153L;
    
    /**
     * id
     */
    private Long id;

    /**
     * 关联名称
     */
    private String rltnName;

    /**
     * 关联编码
     */
    private String rltnCode;
    
    /**
     * 关联类型，1:一对一，2:一对多，3:多对多
     */
    private String rltnType;
    
    /**
     * 多对多关联表存放域名
     */
    private String rltnTableAppDomain;
    
    /**
     * 主键表ID
     */
    private Long primaryTableId;
    
    /**
     * 主键表名称
     */
    private String primaryTableName;
    
    /**
     * 主键表关联字段ID
     */
    private Long primaryFieldId;
    
    /**
     * 主键表关联字段名称
     */
    private String primaryFieldName;
    
    /**
     * 外键表ID
     */
    private Long foreignTableId;
    
    /**
     * 外键表名称
     */
    private String foreignTableName;
    
    /**
     * 外键表关联字段ID
     */
    private Long foreignFieldId;
    
    /**
     * 外键表关联字段名称
     */
    private String foreignFieldName;

    /**
     * 主键表应用域名
     */
    private String primaryTableAppDomain;
    
    /**
     * 外键表应用域名
     */
    private String foreignTableAppDomain;

    /**
     * 级别类型（0-同级别关联，1-系统级和应用级关联）
     */
    private Integer levelType;

}

