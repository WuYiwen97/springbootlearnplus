package com.antaiib.custom.data.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCustomScene<M extends BaseCustomScene<M>> extends Model<M> implements IBean {

	/**
	 * id使用主键策略
	 */
	public void setId(Long id) {
		set("id", id);
	}

	/**
	 * id使用主键策略
	 */
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
	 * 修改时间
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	/**
	 * 修改时间
	 */
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	/**
	 * 创建人
	 */
	public void setCreateId(Long createId) {
		set("create_id", createId);
	}

	/**
	 * 创建人
	 */
	public Long getCreateId() {
		return getLong("create_id");
	}

	/**
	 * 修改人
	 */
	public void setUpdateId(Long updateId) {
		set("update_id", updateId);
	}

	/**
	 * 修改人
	 */
	public Long getUpdateId() {
		return getLong("update_id");
	}

	/**
	 * 应用id
	 */
	public void setAppId(Long appId) {
		set("app_id", appId);
	}

	/**
	 * 应用id
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
	 * 场景名称
	 */
	public void setSceneName(String sceneName) {
		set("scene_name", sceneName);
	}

	/**
	 * 场景名称
	 */
	public String getSceneName() {
		return getStr("scene_name");
	}

	/**
	 * 场景编码
	 */
	public void setSceneCode(String sceneCode) {
		set("scene_code", sceneCode);
	}

	/**
	 * 场景编码
	 */
	public String getSceneCode() {
		return getStr("scene_code");
	}

	/**
	 * 所属行业
	 */
	public void setIndustryCode(String industryCode) {
		set("industry_code", industryCode);
	}
	/**
	 * 树形表存放域名
	 */
	public void setTreeTableAppDomain(String treeTableAppDomain) {
		set("tree_table_app_domain", treeTableAppDomain);
	}

	/**
	 * 树形表存放域名
	 */
	public String getTreeTableAppDomain() {
		return getStr("tree_table_app_domain");
	}


	/**
	 * 所属行业
	 */
	public String getIndustryCode() {
		return getStr("industry_code");
	}

	/**
	 * 树形表名称
	 */
	public void setTreeTableName(String treeTableName) {
		set("tree_table_name", treeTableName);
	}

	/**
	 * 树形表名称
	 */
	public String getTreeTableName() {
		return getStr("tree_table_name");
	}

	/**
	 * 普通数据表名称
	 */
	public void setOrdinaryTableName(String ordinaryTableName) {
		set("ordinary_table_name", ordinaryTableName);
	}

	/**
	 * 普通数据表名称
	 */
	public String getOrdinaryTableName() {
		return getStr("ordinary_table_name");
	}

	/**
	 * 树形表关联字段名
	 */
	public void setTreeTableRltnName(String treeTableRltnName) {
		set("tree_table_rltn_name", treeTableRltnName);
	}

	/**
	 * 树形表关联字段名
	 */
	public String getTreeTableRltnName() {
		return getStr("tree_table_rltn_name");
	}

	/**
	 * 普通表关联字段名
	 */
	public void setOrdinaryTableRltnName(String ordinaryTableRltnName) {
		set("ordinary_table_rltn_name", ordinaryTableRltnName);
	}

	/**
	 * 普通表关联字段名
	 */
	public String getOrdinaryTableRltnName() {
		return getStr("ordinary_table_rltn_name");
	}

	/**
	 * 场景描述
	 */
	public void setSceneDescribe(String sceneDescribe) {
		set("scene_describe", sceneDescribe);
	}

	/**
	 * 场景描述
	 */
	public String getSceneDescribe() {
		return getStr("scene_describe");
	}

	/**
	 * 加载类型 0-lazy 1-all
	 */
	public void setLoadType(Integer loadType) {
		set("load_type", loadType);
	}

	/**
	 * 加载类型 0-lazy 1-all
	 */
	public Integer getLoadType() {
		return getInt("load_type");
	}

	/**
	 * 多对多关联表名
	 */
	public void setRltnTableName(String rltnTableName) {
		set("rltn_table_name", rltnTableName);
	}

	/**
	 * 多对多关联表名
	 */
	public String getRltnTableName() {
		return getStr("rltn_table_name");
	}

	/**
	 * 树表拓展类别字段名
	 */
	public void setTreeStyleName(String treeStyleName) {
		set("tree_style_name", treeStyleName);
	}

	/**
	 * 树表拓展类别字段名
	 */
	public String getTreeStyleName() {
		return getStr("tree_style_name");
	}

	/**
	 * 树表基础类别字段名
	 */
	public void setTreeBasicStyleName(String treeBasicStyleName) {
		set("tree_basic_style_name", treeBasicStyleName);
	}

	/**
	 * 树表基础类别字段名
	 */
	public String getTreeBasicStyleName() {
		return getStr("tree_basic_style_name");
	}

	/**
	 * 树节点字段名称
	 */
	public void setTreeNodeFiled(String treeNodeFiled) {
		set("tree_node_filed", treeNodeFiled);
	}

	/**
	 * 树节点字段名称
	 */
	public String getTreeNodeFiled() {
		return getStr("tree_node_filed");
	}

	/**
	 * 树表配置类型 0-通用 1-类型，  2-层级， -1-无
	 */
	public void setTreeConfigType(Integer treeConfigType) {
		set("tree_config_type", treeConfigType);
	}

	/**
	 * 树表配置类型 0-通用 1-类型，  2-层级， -1-无
	 */
	public Integer getTreeConfigType() {
		return getInt("tree_config_type");
	}

	/**
	 * 普通表配置类型 0-通用，  1-类型， -1-无
	 */
	public void setOrdinaryConfigType(Integer ordinaryConfigType) {
		set("ordinary_config_type", ordinaryConfigType);
	}

	/**
	 * 普通表配置类型 0-通用，  1-类型， -1-无
	 */
	public Integer getOrdinaryConfigType() {
		return getInt("ordinary_config_type");
	}

	/**
	 * 数据表存放域名
	 */
	public void setOrdinaryTableAppDomain(String ordinaryTableAppDomain) {
		set("ordinary_table_app_domain", ordinaryTableAppDomain);
	}

	/**
	 * 数据表存放域名
	 */
	public String getOrdinaryTableAppDomain() {
		return getStr("ordinary_table_app_domain");
	}
	/**
	 * 普通表name字段
	 */
	public void setOrdinaryNameFiled(String ordinaryNameFiled) {
		set("ordinary_name_filed", ordinaryNameFiled);
	}

	/**
	 * 普通表name字段
	 */
	public String getOrdinaryNameFiled() {
		return getStr("ordinary_name_filed");
	}

	/**
	 * 分类表名
	 */
	public void setClassifyTableName(String classifyTableName) {
		set("classify_table_name", classifyTableName);
	}

	/**
	 * 分类表名
	 */
	public String getClassifyTableName() {
		return getStr("classify_table_name");
	}

	/**
	 * 分类关联字段名
	 */
	public void setClassifyTableRltnName(String classifyTableRltnName) {
		set("classify_table_rltn_name", classifyTableRltnName);
	}

	/**
	 * 分类关联字段名
	 */
	public String getClassifyTableRltnName() {
		return getStr("classify_table_rltn_name");
	}

	/**
	 * 是否开启数据下钻 0-false 1-true
	 */
	public void setDataDrillDown(Integer dataDrillDown) {
		set("data_drill_down", dataDrillDown);
	}

	/**
	 * 是否开启数据下钻 0-false 1-true
	 */
	public Integer getDataDrillDown() {
		return getInt("data_drill_down");
	}

	/**
	 * 0-AA 1-AB
	 */
	public void setSceneType(Integer sceneType) {
		set("scene_type", sceneType);
	}

	/**
	 * 0-AA 1-AB
	 */
	public Integer getSceneType() {
		return getInt("scene_type");
	}

	/**
	 * 分类表存放域名
	 */
	public void setClassifyTableAppDomain(String classifyTableAppDomain) {
		set("classify_table_app_domain", classifyTableAppDomain);
	}
	
	/**
	 * 分类表存放域名
	 */
	public String getClassifyTableAppDomain() {
		return getStr("classify_table_app_domain");
	}

}
