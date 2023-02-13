package com.antaiib.custom.data.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCustomTable<M extends BaseCustomTable<M>> extends Model<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return getLong("id");
	}

	/**
	 * 创建时间
	 */
	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	/**
	 * 创建时间
	 */
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	 * 更新时间
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	/**
	 * 更新时间
	 */
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	/**
	 * 创建人id
	 */
	public void setCreateId(Long createId) {
		set("create_id", createId);
	}

	/**
	 * 创建人id
	 */
	public Long getCreateId() {
		return getLong("create_id");
	}

	/**
	 * 修改人id
	 */
	public void setUpdateId(Long updateId) {
		set("update_id", updateId);
	}

	/**
	 * 修改人id
	 */
	public Long getUpdateId() {
		return getLong("update_id");
	}

	public void setAppId(Long appId) {
		set("app_id", appId);
	}

	public Long getAppId() {
		return getLong("app_id");
	}

	/**
	 * 编码
	 */
	public void setTableCode(String tableCode) {
		set("table_code", tableCode);
	}

	/**
	 * 编码
	 */
	public String getTableCode() {
		return getStr("table_code");
	}

	/**
	 * 表名称
	 */
	public void setTableDesname(String tableDesname) {
		set("table_desname", tableDesname);
	}

	/**
	 * 表名称
	 */
	public String getTableDesname() {
		return getStr("table_desname");
	}

	/**
	 * 表实际名称
	 */
	public void setTableName(String tableName) {
		set("table_name", tableName);
	}

	/**
	 * 表实际名称
	 */
	public String getTableName() {
		return getStr("table_name");
	}

	/**
	 * 分类ID
	 */
	public void setClassifyId(String classifyId) {
		set("classify_id", classifyId);
	}

	/**
	 * 分类ID
	 */
	public String getClassifyId() {
		return getStr("classify_id");
	}

	/**
	 * 等级：1-系统级、2-行业级、3-应用级
	 */
	public void setLevel(Integer level) {
		set("level", level);
	}

	/**
	 * 等级：1-系统级、2-行业级、3-应用级
	 */
	public Integer getLevel() {
		return getInt("level");
	}

	/**
	 * 行业ID
	 */
	public void setIndustryId(Long industryId) {
		set("industry_id", industryId);
	}

	/**
	 * 行业ID
	 */
	public Long getIndustryId() {
		return getLong("industry_id");
	}

	/**
	 * 应用域名
	 */
	public void setAppDomain(String appDomain) {
		set("app_domain", appDomain);
	}

	/**
	 * 应用域名
	 */
	public String getAppDomain() {
		return getStr("app_domain");
	}

	/**
	 * 合计项配置属性
	 */
	public void setAttributeInfo(String attributeInfo) {
		set("attribute_info", attributeInfo);
	}

	/**
	 * 合计项配置属性
	 */
	public String getAttributeInfo() {
		return getStr("attribute_info");
	}

	/**
	 * 表备注
	 */
	public void setRemark(String remark) {
		set("remark", remark);
	}

	/**
	 * 表备注
	 */
	public String getRemark() {
		return getStr("remark");
	}

	public void setSource(Integer source) {
		set("source", source);
	}

	public Integer getSource() {
		return getInt("source");
	}

	/**
	 * 是否抽取 1抽取 0不抽取
	 */
	public void setExtractFlag(Integer extractFlag) {
		set("extract_flag", extractFlag);
	}

	/**
	 * 是否抽取 1抽取 0不抽取
	 */
	public Integer getExtractFlag() {
		return getInt("extract_flag");
	}

	/**
	 * 0根据type抽取生成更新语句；1更新时跳过
	 */
	public void setIsAll(Integer isAll) {
		set("is_all", isAll);
	}

	/**
	 * 0根据type抽取生成更新语句；1更新时跳过
	 */
	public Integer getIsAll() {
		return getInt("is_all");
	}

	/**
	 * 1234567
	 */
	public void setType(Integer type) {
		set("type", type);
	}

	/**
	 * 1234567
	 */
	public Integer getType() {
		return getInt("type");
	}

	/**
	 * 抽取条件
	 */
	public void setExtractColumn(String extractColumn) {
		set("extract_column", extractColumn);
	}

	/**
	 * 抽取条件
	 */
	public String getExtractColumn() {
		return getStr("extract_column");
	}

	/**
	 * 是否开启动态权限功能 1开启 0关闭
	 */
	public void setDynamicPermissions(Integer dynamicPermissions) {
		set("dynamic_permissions", dynamicPermissions);
	}

	/**
	 * 是否开启动态权限功能 1开启 0关闭
	 */
	public Integer getDynamicPermissions() {
		return getInt("dynamic_permissions");
	}
	/**
	 * 是否启用动态属性 1开启 0关闭
	 */
	public void setDynamicProperty(Integer dynamicProperty) {
		set("dynamic_property", dynamicProperty);
	}

	/**
	 * 是否启用动态属性 1开启 0关闭
	 */
	public Integer getDynamicProperty() {
		return getInt("dynamic_property");
	}
	/**
	 * 数据表类型，0：普通数据表，1：树状数据表
	 */
	public void setTableType(Integer tableType) {
		set("table_type", tableType);
	}

	/**
	 * 数据表类型，0：普通数据表，1：树状数据表
	 */
	public Integer getTableType() {
		return getInt("table_type");
	}

	/**
	 * 编码字段名(fleld_code)
	 */
	public void setCodeName(String codeName) {
		set("code_name", codeName);
	}

	/**
	 * 编码字段名(fleld_code)
	 */
	public String getCodeName() {
		return getStr("code_name");
	}

	/**
	 * 是否是动态表 0不是动态表 1 是动态表
	 */
	public void setDynamicTable(Integer dynamicTable) {
		set("dynamic_table", dynamicTable);
	}

	/**
	 * 是否是动态表 0不是动态表 1 是动态表
	 */
	public Integer getDynamicTable() {
		return getInt("dynamic_table");
	}

	/**
	 * 动态表所属appId
	 */
	public void setDynamicAppId(Long dynamicAppId) {
		set("dynamic_app_id", dynamicAppId);
	}

	/**
	 * 动态表所属appId
	 */
	public Long getDynamicAppId() {
		return getLong("dynamic_app_id");
	}

	/**
	 * 慧核私有表:0不是私有 1私有
	 */
	public void setTablePrivate(Integer tablePrivate) {
		set("table_private", tablePrivate);
	}

	/**
	 * 慧核私有表:0不是私有 1私有
	 */
	public Integer getTablePrivate() {
		return getInt("table_private");
	}

	public void setLogicalDeletionFlag(Integer logicalDeletionFlag) {
		set("logical_deletion_flag",logicalDeletionFlag);
	}

	public Integer getLogicalDeletionFlag(){
		return getInt("logical_deletion_flag");
	}


	public String getWriteBack() {
		return getStr("write_back");
	}

	public void setWriteBack(String writeBack) {
		set("write_back", writeBack);
	}


	/**
	 * 数据表所属模块编码
	 */
	public void setModuleCode(String moduleCode){
		set("module_code", moduleCode);
	}

	/**
	 * 数据表所属模块编码
	 */
	public String getModuleCode(){
		return getStr("module_code");
	}

	/**
	 * 业务分类编码
	 */
	public void setBusinessClassifyCode(String businessClassifyCode) {
		set("business_classify_code", businessClassifyCode);
	}

	/**
	 * 业务分类编码
	 */
	public String getBusinessClassifyCode() {
		return getStr("business_classify_code");
	}

	/**
	 * 负责人
	 */
	public void setTableHead(String tableHead) {
		set("table_head", tableHead);
	}

	/**
	 * 负责人
	 */
	public String getTableHead() {
		return getStr("table_head");
	}

    /**
     * 是否开启流程状态(0-关闭、1-开启)
     */
    public void setProcessEnable(Integer processEnable) {
        set("process_enable", processEnable);
    }

    /**
     * 是否开启流程状态(0-关闭、1-开启)
     */
    public Integer getProcessEnable() {
        return getInt("process_enable");
    }

	/**
	 * 是否开启表单选择 只有私有表生效  默认0
	 * 0-无表单
	 * 1-流程表单
	 * 2-业务表单
	 * 3-业务表单+流程表单
	 */
	public void setFormSelect(Integer formSelect) {
		set("form_select", formSelect);
	}

	/**
	 * 是否开启表单选择 只有私有表生效 默认0
	 * 0-无表单
	 * 1-流程表单
	 * 2-业务表单
	 * 3-业务表单+流程表单
	 */
	public Integer getFormSelect() {
		return getInt("form_select");
	}

	/**
	 * 动态权限字段
	 */
	public void setDynamicPermissionsField(String dynamicPermissionsField) {
		set("dynamic_permissions_field", dynamicPermissionsField);
	}

	/**
	 * 动态权限字段
	 */
	public String getDynamicPermissionsField() {
		return getStr("dynamic_permissions_field");
	}
}
