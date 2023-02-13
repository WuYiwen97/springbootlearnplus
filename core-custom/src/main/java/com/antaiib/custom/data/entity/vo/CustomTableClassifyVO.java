package com.antaiib.custom.data.entity.vo;

import com.antaiib.custom.data.entity.CustomTableClassify;
import com.antaiib.custom.data.entity.base.BaseCustomTableClassify;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 树型分类VO
 *
 * @author yz
 * @date 2021/7/8 13:08
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomTableClassifyVO extends BaseCustomTableClassify<CustomTableClassify> {
    /**
     * 是否可修改
     */
    private boolean canEdit;

    /**
     * 是否可新增
     */
    private boolean canAdd;

    /**
     * 类型（api服务中用来标识是分类类型（0）还是数据表类型（1））
     */
    private String type;

    /**
     * 数据表类型
     */
    private Integer tableType;

    List<CustomTableClassifyVO> children;
}
