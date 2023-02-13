package com.antaiib.custom.param.v3;

import cn.atfusion.atdubbo.core.custom.vo.v3.SaveFormParam;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 表单公式计算接口入参
 *
 * @author yz
 * @date 2021/10/28 19:42
 */
@Data
/**
  * 表单公式计算接口入参
 */
public class FormCalcParam {
    /**
  * 表单编码
 */
    private String formCode;

    /**
  * 触发字段所属表名
 */
    private String triggerTableName;

    /**
  * 触发字段名称
 */
    private String triggerFieldName;

    /**
  * 子表触发字段所在记录的id
 */
    private Long recordId;

    /**
  * 表单数据
 */
    private SaveFormParam formData;

    /**
  * 流程高级权限公式
 */
    private Map<String, List<FormulaParam>> permissionFormula;
}
