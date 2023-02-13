package com.antaiib.custom.data.entity.vo;

import com.antaiib.custom.data.entity.CustomFormClassify;
import com.antaiib.custom.data.entity.base.BaseCustomFormClassify;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 表单树型分类VO
 *
 * @author yz
 * @date 2021/10/15 13:08
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomFormClassifyVO extends BaseCustomFormClassify<CustomFormClassify> {
    /**
     * 类型,标识是分类类型（0）还是表单类型（1）
     */
    private String type;
    /**
     * 表单类型，type为1时，区分该表单为流程表单或业务表单   1-流程表单  2-业务表单
     */
    private String formType;
    /**
     * 表单分类id
     */
    private Long classifyId;

    List<CustomFormClassifyVO> children;
}
