package com.antaiib.custom.data.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCustomFormFormulaFunction<M extends BaseCustomFormFormulaFunction<M>> extends Model<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}
	
	public Long getId() {
		return getLong("id");
	}

	/**
	 * 应用ID。默认为0，所有应用共享；若不为0，则为某个应用私有
	 */
	public void setAppId(Long appId) {
		set("app_id", appId);
	}
	
	/**
	 * 应用ID。默认为0，所有应用共享；若不为0，则为某个应用私有
	 */
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
	 * 函数名称
	 */
	public void setFuncName(String funcName) {
		set("func_name", funcName);
	}
	
	/**
	 * 函数名称
	 */
	public String getFuncName() {
		return getStr("func_name");
	}

	/**
	 * 函数参数配置，JSON文本字符串。
	 */
	public void setFuncArgs(String funcArgs) {
		set("func_args", funcArgs);
	}
	
	/**
	 * 函数参数配置，JSON文本字符串。
	 */
	public String getFuncArgs() {
		return getStr("func_args");
	}

	/**
	 * 函数介绍
	 */
	public void setFuncIntro(String funcIntro) {
		set("func_intro", funcIntro);
	}
	
	/**
	 * 函数介绍
	 */
	public String getFuncIntro() {
		return getStr("func_intro");
	}

	/**
	 * 显示名称
	 */
	public void setDisplayName(String displayName) {
		set("display_name", displayName);
	}
	
	/**
	 * 显示名称
	 */
	public String getDisplayName() {
		return getStr("display_name");
	}

	/**
	 * 适用的字段类型及显示类型，格式：[number::text],[number::textarea]，多个以,隔开。
	 */
	public void setForFieldType(String forFieldType) {
		set("for_field_type", forFieldType);
	}
	
	/**
	 * 适用的字段类型及显示类型，格式：[number::text],[number::textarea]，多个以,隔开。
	 */
	public String getForFieldType() {
		return getStr("for_field_type");
	}

	/**
	 * 序号
	 */
	public void setSeqNo(Integer seqNo) {
		set("seq_no", seqNo);
	}
	
	/**
	 * 序号
	 */
	public Integer getSeqNo() {
		return getInt("seq_no");
	}

	/**
	 * 启用状态。0-禁用，1-启用。
	 */
	public void setEnableFlag(Integer enableFlag) {
		set("enable_flag", enableFlag);
	}
	
	/**
	 * 启用状态。0-禁用，1-启用。
	 */
	public Integer getEnableFlag() {
		return getInt("enable_flag");
	}

	/**
	 * 1-主表，2-明细表 3-高级公式
	 */
	public void setCategory(Integer category) {
		set("category", category);
	}
	
	/**
	 * 1-主表，2-明细表 3-高级公式
	 */
	public Integer getCategory() {
		return getInt("category");
	}

}
