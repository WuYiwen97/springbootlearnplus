package com.antaiib.custom.data.entity.vo;

import com.antaiib.custom.data.entity.CustomField;
import lombok.Data;

import java.util.List;

/**
 *
 *
 * @author yz
 * @date 2021/10/13 13:08
 */
@Data
public class RltnTableAndFieldVO {
    /**
     * 表的id
     */
    private Long id;

    /**
     * 表的名称
     */
    private String tableName;

    /**
     * 表的描述名称
     */
    private String tableDescName;

    /**
     *  等级：1-系统级、2-行业级、3-应用级
     */
    private Integer level;

    /**
     * 所属分类
     */
    private String classifyId;

    /**
     * 字段列表
     */
    private List<CustomField> fieldList;

    /**
     * 保存表单类型
     * 1-流程表单
     * 2-业务表单
     * 3-业务表单+流程表单
     */
    private String formType;

    List<RltnTableAndFieldVO> rltnTableList;
}
