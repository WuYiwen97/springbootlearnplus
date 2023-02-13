package com.antaiib.custom.param.v3;

import lombok.Data;

/**
 * 公式参数
 *
 * [{"keyword":"if","condition":"{编号} = '1'","result":"{询价情况-详细}","sort":"0"},
 * {"keyword":"else if","condition":"{编号} = '2'","result":"{询价情况-详细}","sort":"1"},
 * {"keyword":"else","condition":"","result":"3","sort":"2"}]
 *
 * @author yz
 * @date 2021/10/28 20:02
 */
@Data
public class FormulaParam {
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
    private String result;
    /**
     * 排序
     */
    private Integer sort;
}
