package com.antaiib.custom.data.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCustomModuleBusinessClassify<M extends BaseCustomModuleBusinessClassify<M>> extends Model<M> implements IBean {

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
	 * 所属模块
	 */
	public void setModuleCode(String moduleCode) {
		set("module_code", moduleCode);
	}

	/**
	 * 所属模块
	 */
	public String getModuleCode() {
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
	 * 业务分类名称
	 */
	public void setBusinessClassifyName(String businessClassifyName) {
		set("business_classify_name", businessClassifyName);
	}

	/**
	 * 业务分类名称
	 */
	public String getBusinessClassifyName() {
		return getStr("business_classify_name");
	}

}
