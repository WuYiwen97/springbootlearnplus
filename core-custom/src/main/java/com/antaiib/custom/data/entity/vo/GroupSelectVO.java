package com.antaiib.custom.data.entity.vo;

import lombok.Data;

import java.util.List;

/**
 * 分组下拉框VO类，结构如下：
 *        {
 *             "label": "通用模块",
 *             "options": [
 *                 {
 *                     "id": 11000005613,
 *                     "tableCode": "amount_info",
 *                     "tableDesname": "金额信息表",
 *                     "tableName": "custom_amount_info",
 *                     "appDomain": "fsn_core_custom",
 *                     "tableType": 0,
 *                     "moduleName": "通用模块"
 *                 }
 *             ]
 *         }
 *
 * @author yz
 * @since 2022/8/12 17:48
 */
@Data
public class GroupSelectVO<T> {
    /**
     * 分组标签
     */
    private String label;

    /**
     * 每一组的列表
     */
    private List<T> options;
}
