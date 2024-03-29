package com.antaiib.custom.data.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCustomTableIndex<M extends BaseCustomTableIndex<M>> extends Model<M> implements IBean {

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

    public void setSource(Integer source) {
        set("source", source);
    }

    public Integer getSource() {
        return getInt("source");
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

    public void setTableId(Long tableId) {
        set("table_id", tableId);
    }

    public Long getTableId() {
        return getLong("table_id");
    }

    /**
     * 表名
     */
    public void setTableName(String tableName) {
        set("table_name", tableName);
    }

    /**
     * 表名
     */
    public String getTableName() {
        return getStr("table_name");
    }

    /**
     * mysql建立索引语句
     */
    public void setMysqlIndexSql(String mysqlIndexSql) {
        set("mysql_index_sql", mysqlIndexSql);
    }

    /**
     * mysql建立索引语句
     */
    public String getMysqlIndexSql() {
        return getStr("mysql_index_sql");
    }

    /**
     * dameng建立索引语句
     */
    public void setDamengIndexSql(String damengIndexSql) {
        set("dameng_index_sql", damengIndexSql);
    }

    /**
     * dameng建立索引语句
     */
    public String getDamengIndexSql() {
        return getStr("dameng_index_sql");
    }

    /**
     * 索引编码
     */
    public void setIndexCode(String indexCode) {
        set("index_code", indexCode);
    }

    /**
     * 索引编码
     */
    public String getIndexCode() {
        return getStr("index_code");
    }

    /**
     * 索引名称
     */
    public void setIndexName(String indexName) {
        set("index_name", indexName);
    }

    /**
     * 索引名称
     */
    public String getIndexName() {
        return getStr("index_name");
    }

    /**
     * 索引类型
     */
    public void setIndexType(Integer indexType) {
        set("index_type", indexType);
    }

    /**
     * 索引类型
     */
    public Integer getIndexType() {
        return getInt("index_type");
    }

    /**
     * 索引字段名
     */
    public void setIndexField(String indexField) {
        set("index_field", indexField);
    }

    /**
     * 索引字段名
     */
    public String getIndexField() {
        return getStr("index_field");
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
	 * 索引来源。0-用户手动添加，1-系统自动添加（编码字段）
	 */
	public void setIndexSource(Integer indexSource) {
		set("index_source", indexSource);
	}
	
	/**
	 * 索引来源。0-用户手动添加，1-系统自动添加（编码字段）
	 */
	public Integer getIndexSource() {
		return getInt("index_source");
	}

}
