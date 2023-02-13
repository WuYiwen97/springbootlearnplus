package com.antaiib.custom.param.v3;

import com.antaiib.custom.data.entity.CustomFormAccessFormulaConf;
import com.antaiib.custom.data.entity.CustomFormFormulaConf;
import com.antaiib.custom.data.entity.CustomFormInfo;
import com.antaiib.custom.data.entity.CustomFormRelatedDataConfig;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 表单信息入参
 *
 * @author yz
 * @date 2021/10/27 10:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FormInfoInParam extends CustomFormInfo{
    /**
     * 公式列表
     * CustomFormFormulaConf 计算公式表
     */
    private List<CustomFormFormulaConf> formulaList;
    /**
     * 表单关联字段配置
     */
    private List<CustomFormRelatedDataConfig> relatedFieldList;

    /**
     * 权限计算公式
     */
    private List<CustomFormAccessFormulaConf> permissionList;
}
