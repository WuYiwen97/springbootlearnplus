package com.antaiib.custom.data.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCustomFormAccessFormulaConf<M extends BaseCustomFormAccessFormulaConf<M>> extends Model<M> implements IBean {

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

	/**
	 * 所属信息
	 */
	public void setBelongInfo(String belongInfo) {
		set("belong_info", belongInfo);
	}
	
	/**
	 * 所属信息
	 */
	public String getBelongInfo() {
		return getStr("belong_info");
	}

	/**
	 * 应用ID
	 */
	public void setAppId(Long appId) {
		set("app_id", appId);
	}
	
	/**
	 * 应用ID
	 */
	public Long getAppId() {
		return getLong("app_id");
	}

	/**
	 * 来源：1：云，2：端
	 */
	public void setSource(Integer source) {
		set("source", source);
	}
	
	/**
	 * 来源：1：云，2：端
	 */
	public Integer getSource() {
		return getInt("source");
	}

	/**
	 * 表单编码
	 */
	public void setFormCode(String formCode) {
		set("form_code", formCode);
	}
	
	/**
	 * 表单编码
	 */
	public String getFormCode() {
		return getStr("form_code");
	}

	/**
	 * 表单ID
	 */
	public void setFormId(Long formId) {
		set("form_id", formId);
	}
	
	/**
	 * 表单ID
	 */
	public Long getFormId() {
		return getLong("form_id");
	}

	/**
	 * 权限计算公式
	 */
	public void setFormula(String formula) {
		set("formula", formula);
	}
	
	/**
	 * 权限计算公式
	 */
	public String getFormula() {
		return getStr("formula");
	}

	/**
	 * 赋值表名称
	 */
	public void setTableName(String tableName) {
		set("table_name", tableName);
	}
	
	/**
	 * 赋值表名称
	 */
	public String getTableName() {
		return getStr("table_name");
	}

	/**
	 * 赋值字段名称
	 */
	public void setFieldName(String fieldName) {
		set("field_name", fieldName);
	}
	
	/**
	 * 赋值字段名称
	 */
	public String getFieldName() {
		return getStr("field_name");
	}

	/**
	 * 流程节点Id
	 */
	public void setTaskId(String taskId) {
		set("task_id", taskId);
	}
	
	/**
	 * 流程节点Id
	 */
	public String getTaskId() {
		return getStr("task_id");
	}

	/**
	 * 流程编码
	 */
	public void setProcessDefinitionKey(String processDefinitionKey) {
		set("process_definition_key", processDefinitionKey);
	}
	
	/**
	 * 流程编码
	 */
	public String getProcessDefinitionKey() {
		return getStr("process_definition_key");
	}

}