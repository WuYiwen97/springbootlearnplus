package com.antaiib.custom.param.v3;

import lombok.Data;

/**
 * @ProjectName: fsn-api-s
 * @Package: com.antaiib.custom.param.v3
 * @ClassName: PermissionFormulaParam
 * @Description:
 * @Author: wangth
 * @CreateDate: 2022/4/11 15:10
 * @UpdateUser:
 * @UpdateDate:
 * @UpdateRemark:
 */
@Data
public class PermissionFormulaParam {
    /**
     * 关键字 if else if else
     */
    private String keyword;
    /**
     * 条件
     */
    private String condition;
    /**
     * 结果
     */
    private Object result;
    /**
     * 排序
     */
    private Integer sort;

}
