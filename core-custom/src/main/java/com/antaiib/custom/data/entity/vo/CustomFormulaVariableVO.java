package com.antaiib.custom.data.entity.vo;

import com.antaiib.custom.data.entity.CustomFormFormulaVariable;
import lombok.Data;

import java.util.List;

/**
 * 公式内置变量VO
 *
 * @author yz
 * @date 2021/11/04 13:08
 */
@Data
public class CustomFormulaVariableVO {
    /**
     * 分类。1-组织机构分类，2-日期时间分类。
     */
    private Integer category;
    /**
     * 变量分类名称
     */
    private String categoryName;

    List<CustomFormFormulaVariable> variableList;
}
