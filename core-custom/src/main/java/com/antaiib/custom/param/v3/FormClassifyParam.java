package com.antaiib.custom.param.v3;


import lombok.Data;

/**
 * @ProjectName: fsn-api-s
 * @Package: com.antaiib.custom.param.v4
 * @ClassName: FormClassifyParam
 * @Description:
 * @Author: wangth
 * @CreateDate: 2022/3/23 20:27
 * @UpdateUser:
 * @UpdateDate:
 * @UpdateRemark:
 */
@Data
/**
  * 表单分类查询条件
 */
public class FormClassifyParam {

    private Long id;

    private String code;

    private String name;

    /**
     * 表单类型  1-流程表单，2-业务表单
     */
    private String formType;

    /**
     * 0-旧表单 1-新表单
     */
    private Integer formFlag;
}
