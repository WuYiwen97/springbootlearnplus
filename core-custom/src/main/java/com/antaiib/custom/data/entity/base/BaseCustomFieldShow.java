package com.antaiib.custom.data.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCustomFieldShow<M extends BaseCustomFieldShow<M>> extends Model<M> implements IBean {

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
	 * 应用ID，默认为0，所有应用共享，若不为0，则为某个应用私有
	 */
	public void setAppId(Long appId) {
		set("app_id", appId);
	}

	/**
	 * 应用ID，默认为0，所有应用共享，若不为0，则为某个应用私有
	 */
	public Long getAppId() {
		return getLong("app_id");
	}

	/**
	 * 字段显示编码
	 */
	public void setShowCode(String showCode) {
		set("show_code", showCode);
	}

	/**
	 * 字段显示编码
	 */
	public String getShowCode() {
		return getStr("show_code");
	}

	/**
	 * 字段显示名称
	 */
	public void setShowName(String showName) {
		set("show_name", showName);
	}

	/**
	 * 字段显示名称
	 */
	public String getShowName() {
		return getStr("show_name");
	}

	/**
	 * 字段显示类型
	 */
	public void setShowType(String showType) {
		set("show_type", showType);
	}

	/**
	 * 字段显示类型
	 */
	public String getShowType() {
		return getStr("show_type");
	}

	/**
	 * 个性化属性
	 */
	public void setBaseAttributeInfo(String baseAttributeInfo) {
		set("base_attribute_info", baseAttributeInfo);
	}

	/**
	 * 个性化属性
	 */
	public String getBaseAttributeInfo() {
		return getStr("base_attribute_info");
	}

	/**
	 * 备注
	 */
	public void setShowRemark(String showRemark) {
		set("show_remark", showRemark);
	}

	/**
	 * 备注
	 */
	public String getShowRemark() {
		return getStr("show_remark");
	}

	/**
	 * 支持字段类型（1-整型，2-浮点型，3-字符型，4-文本型）
	 */
	public void setFieldType(String fieldType) {
		set("field_type", fieldType);
	}

	/**
	 * 支持字段类型（1-整型，2-浮点型，3-字符型，4-文本型）
	 */
	public String getFieldType() {
		return getStr("field_type");
	}

	/**
	 * 字段默认值
	 */
	public String getDefaulAttributeInfo(){return getStr("defaul_attribute_info");}

	/**
	 *字段默认值
	 */
	public void setDefaulAttributeInfo(String defaulAttributeInfo) {
		set("defaul_attribute_info", defaulAttributeInfo);
	}

}
