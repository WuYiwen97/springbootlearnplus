package com.antaiib.custom.data.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCustomFormTableRltn<M extends BaseCustomFormTableRltn<M>> extends Model<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return getLong("id");
	}

	public void setAppId(Long appId) {
		set("app_id", appId);
	}

	public Long getAppId() {
		return getLong("app_id");
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
	 * 数据表分类ID
	 */
	public void setClassifyId(Long classifyId) {
		set("classify_id", classifyId);
	}

	/**
	 * 数据表分类ID
	 */
	public Long getClassifyId() {
		return getLong("classify_id");
	}

	/**
	 * 数据表ID
	 */
	public void setTableId(Long tableId) {
		set("table_id", tableId);
	}

	/**
	 * 数据表ID
	 */
	public Long getTableId() {
		return getLong("table_id");
	}

	/**
	 * 字段ID
	 */
	public void setFieldId(Long fieldId) {
		set("field_id", fieldId);
	}

	/**
	 * 字段ID
	 */
	public Long getFieldId() {
		return getLong("field_id");
	}

	/**
	 * 是否是主表：0：是，1：否
	 */
	public void setIsMaintable(String isMaintable) {
		set("is_maintable", isMaintable);
	}

	/**
	 * 是否是主表：0：是，1：否
	 */
	public String getIsMaintable() {
		return getStr("is_maintable");
	}

}
