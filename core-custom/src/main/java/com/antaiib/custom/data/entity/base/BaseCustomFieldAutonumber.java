package com.antaiib.custom.data.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCustomFieldAutonumber<M extends BaseCustomFieldAutonumber<M>> extends Model<M> implements IBean {

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
	 * 字段id
	 */
	public void setFieldId(Long fieldId) {
		set("field_id", fieldId);
	}

	/**
	 * 字段id
	 */
	public Long getFieldId() {
		return getLong("field_id");
	}

	/**
	 * 前缀
	 */
	public void setPrefix(String prefix) {
		set("prefix", prefix);
	}

	/**
	 * 前缀
	 */
	public String getPrefix() {
		return getStr("prefix");
	}

	/**
	 * 年号规则 0-无 1-年 2-年月 3-年月日
	 */
	public void setYearRules(Integer yearRules) {
		set("year_rules", yearRules);
	}

	/**
	 * 年号规则 0-无 1-年 2-年月 3-年月日
	 */
	public Integer getYearRules() {
		return getInt("year_rules");
	}

	/**
	 * 起始值
	 */
	public void setMinValue(Long minValue) {
		set("min_value", minValue);
	}

	/**
	 * 起始值
	 */
	public Long getMinValue() {
		return getLong("min_value");
	}

	/**
	 * 位数
	 */
	public void setDigit(Long digit) {
		set("digit", digit);
	}

	/**
	 * 位数
	 */
	public Long getDigit() {
		return getLong("digit");
	}

	/**
	 * 步长
	 */
	public void setStep(Integer step) {
		set("step", step);
	}

	/**
	 * 步长
	 */
	public Integer getStep() {
		return getInt("step");
	}

	/**
	 * 0-不固定 1-固定
	 */
	public void setFixLenShow(Integer fixLenShow) {
		set("fix_len_show", fixLenShow);
	}

	/**
	 * 0-不固定 1-固定
	 */
	public Integer getFixLenShow() {
		return getInt("fix_len_show");
	}

	/**
	 * 重置规则 0-不重置 1-年 2-月 3-日
	 */
	public void setResetRules(Integer resetRules) {
		set("reset_rules", resetRules);
	}

	/**
	 * 重置规则 0-不重置 1-年 2-月 3-日
	 */
	public Integer getResetRules() {
		return getInt("reset_rules");
	}

	/**
	 * 后缀
	 */
	public void setSuffix(String suffix) {
		set("suffix", suffix);
	}

	/**
	 * 后缀
	 */
	public String getSuffix() {
		return getStr("suffix");
	}

	/**
	 * 预览
	 */
	public void setDispValue(String dispValue) {
		set("disp_value", dispValue);
	}

	/**
	 * 预览
	 */
	public String getDispValue() {
		return getStr("disp_value");
	}

	/**
	 * 目前的值
	 */
	public void setPresentValue(Long presentValue) {
		set("present_value", presentValue);
	}

	/**
	 * 目前的值
	 */
	public Long getPresentValue() {
		return getLong("present_value");
	}

	public void setAppId(Long appId) {
		set("app_id", appId);
	}

	public Long getAppId() {
		return getLong("app_id");
	}

	/**
	 * 自动编码策略名称
	 */
	public void setName(String suffix) {
		set("name", suffix);
	}

	/**
	 * 自动编码策略名称
	 */
	public String getName() {
		return getStr("name");
	}

	/**
	 * 自动编码策略编码
	 */
	public void setNumberCode(String numberCode) {
		set("number_code", numberCode);
	}

	/**
	 * 自动编码策略编码
	 */
	public String getNumberCode() {
		return getStr("number_code");
	}

}