package com.antaiib.custom.param.v3;

import cn.atfusion.atdubbo.core.custom.vo.v3.SaveFormParam;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: fsn-api-s
 * @Package: com.antaiib.custom.param.v3
 * @ClassName: InitFormulaCalcParam
 * @Description:
 * @Author: wangth
 * @CreateDate: 2022/3/3 16:52
 * @UpdateUser:
 * @UpdateDate:
 * @UpdateRemark:
 */
@Data
/**
  * 表单公式计算接口入参
 */
public class InitFormulaCalcParam {
    /**
  * 表单编码
 */
    private String formCode;
    /**
  * 流程编码
 */
    private String processDefinitionKey;
    /**
  * 流程节点ID
 */
    private String taskId;
    /**
  * 表单数据
 */
    private SaveFormParam saveFormParam;
    /**
  * 字段权限入参
 */
    private Map<String, List<FormulaParam>> permissionFormula;
    /**
  * 字段权限出参
 */
    private Map<String, Map<Long, Map<String, Object>>> permissionList;

    /**
     * 是否调用高级权限设置
     */
    private Boolean modifiable = true;
}
