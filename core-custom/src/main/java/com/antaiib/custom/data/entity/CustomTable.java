package com.antaiib.custom.data.entity;

import com.antaiib.custom.data.entity.base.BaseCustomTable;
import com.antaiib.custom.data.utils.format.CustomFormat;

import javax.persistence.Column;
import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class CustomTable extends BaseCustomTable<CustomTable> {

    @CustomFormat(code = "classify", needAppId = true, defaultValue = "0", relationFields = {"level", "industryId"},redisHashItem = "id")
    @Column(name = "classify_id", columnDefinition = "所属分类（必填）", nullable = false)
    private String classifyId;
    /**
     * 编码
     */
    @Column(name = "table_code", columnDefinition = "编码（必填）", nullable = false, unique = true)
    private String tableCode;
    /**
     * 表名称
     */
    @Column(name = "table_desname", columnDefinition = "描述名称（必填）", nullable = false)
    private String tableDesname;
    /**
     * 表实际名称
     */
    @Column(name = "table_name", columnDefinition = "数据表名称（必填）", nullable = false, unique = true)
    private String tableName;
    /**
     * 表所在数据库
     */
    @Column(name = "app_domain", columnDefinition = "所在数据库（必填）")
    private String appDomain;
    /**
     * 数据表类型，0：普通数据表，1：树状数据表
     */
    @Column(name = "table_type", columnDefinition = "数据表类型（必填）")
    private Integer tableType;
    /**
     * 等级：1-系统级、2-行业级、3-应用级
     */
    private List<Integer> levels;

    /**
     * 是否抽取 1抽取 0不抽取
     */
    @Column(name = "extract_flag", columnDefinition = "是否抽取")
    private Integer extractFlag;
    /**
     * 0根据type抽取生成更新语句；1更新时跳过
     */
    @Column(name = "is_all", columnDefinition = "是否仅初始化部署时抽取")
    private Integer isAll;
    /**
     * 抽取类型 1234567
     * https://jcyfb.yuque.com/docs/share/7f0e0eaf-bde9-4f3b-a5a3-50acf26f2e86?#
     */
    @Column(name = "type", columnDefinition = "抽取类型")
    private Integer type;
    /**
     * 抽取条件
     */
    @Column(name = "extract_column", columnDefinition = "抽取条件")
    private String extractColumn;
    /**
     * 端数据回写策略: insert-仅新增主键冲突不处理；replace-存在则更新，不存在新增；no-不导出数据
     */
    @Column(name = "write_back", columnDefinition = "回写策略（必填）")
    private String writeBack;

    /**
     * 逻辑删除标识-字段名
     */
    private String logicalDeletionInfo;

    public String getLogicalDeletionInfo() {
        return logicalDeletionInfo;
    }

    public void setLogicalDeletionInfo(String logicalDeletionInfo) {
        this.logicalDeletionInfo = logicalDeletionInfo;
    }

    public List<Integer> getLevels() {
        return levels;
    }

    public void setLevels(List<Integer> levels) {
        this.levels = levels;
    }

}
