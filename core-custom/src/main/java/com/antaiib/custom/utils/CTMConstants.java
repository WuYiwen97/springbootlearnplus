package com.antaiib.custom.utils;

import java.util.regex.Pattern;

public final class CTMConstants {

    /**
     * 逻辑删除
     */
    public static final int LOGICAL_DELETE_ON = 1;
    public static final int LOGICAL_DELETE_OFF = 0;
    /**
     * 逻辑删除id字段名称
     */
    public static final String LOGICAL_DEL_ID_FIELD_NAME = "del_id";


    /**
     * 自动编号字段显示方式
     */
    public static final String AUTO_NUM_FIELD_SHOW = "autonumber";

    /**
     * 自动编号 策略key
     */
    public static final String AUTO_NUM_CODE = "numberCode";

    public static final String TABLE = "table";
    public static final String FORM = "form";

    /**
     * 唯一索引前缀
     */
    public static final String UNIQUE_INDEX_PREFIX = "uqidx_";
    /**
     * 系统表、行业级表根分类id
     */
    public static final long SYSTEM_LEVEL_CLASSIFY_ID = 10000000L;
    public static final long INDUSTRY_LEVEL_CLASSIFY_ID = 20000000L;

    /**
     * *****************************************************************************************************************
     * -----------------------------------------------      智圭表相关       -----------------------------------------------
     * *****************************************************************************************************************
     */

    /**
     * 慧核私有表:0不是私有 1私有
     */
    public static final int PRIVATE_TABLE = 1;
    public static final int NOT_PRIVATE_TABLE = 0;


    /**
     * *****************************************************************************************************************
     * -----------------------------------------------      树表相关       -----------------------------------------------
     * *****************************************************************************************************************
     */
    public static class TreeTable {
        /**
         * 固定字段相关
         */
        public static final String PCODE = "pcode";
        public static final String LEVLE = "level";
        public static final String CODE_CHAIN = "code_chain";
        public static final String SORT = "sort";

        /**
         * 约定值相关
         */
        public static final String ROOT_PCODE = "-1";
        public static final int ROOT_LEVEL = 0;
    }


    /**
     * *****************************************************************************************************************
     * ----------------------------------------------      树解析器相关       ---------------------------------------------
     * *****************************************************************************************************************
     */
    public static class TreeParser {
        /**
         * 固定字段相关
         */
        public static final String LAST_LEVEL_FLAG = "last_level_flag";
        /**
         * 约定值相关
         */
        //表类型：树表
        public static final int TREE_TABLE_TYPE = 0;
        //表类型：数据表
        public static final int DATA_TABLE_TYPE = 1;

    }


    /**
     * *****************************************************************************************************************
     * ----------------------------------------------      表单相关       ---------------------------------------------
     * *****************************************************************************************************************
     */

    public static class form {

        //无表单
        public static final String NO_FORM = "0";
        //表单类型 流程表单
        public static final String PROCESS_FORM = "1";
        //表单类型 业务表单
        public static final String BUSINESS_FORM = "2";
        //表单类型 流程表单+业务表单
        public static final String BUSINESS_PROCESS_FORM = "3";

        //选择表单字段隐藏不可见
        public static final int FIELD_NOT_SHOW = 0;
        //表单默认字段
        public static final int FIELD_DEFAULT = 1;
        //选择表单字段必选
        public static final int FIELD_SELECT_REQUIRED = 2;
        //表单隐藏域字段
        public static final int FIELD_SELECT_HIDDEN = 3;

        //旧表单
        public static final int OLD_FORM_FLAG = 0;
        //新表单
        public static final int NEW_FORM_FLAG = 1;
    }

    /**
     * *****************************************************************************************************************
     * ----------------------------------------------     动态属性相关      ---------------------------------------------
     * *****************************************************************************************************************
     */

    public static class DynamicProp {
        /**
         * 实体测点关联表表名
         */
        public static final String TABLE_ENTITY_TAG_RLTN = "cus_entity_tag_rltn";
        public static final String ENTITY_TAG_RLTN = "entity_tag_rltn";
        /**
         * 动态属性表表名
         */
        public static final String TABLE_DYNAMIC_PROPERTIES = "cus_dynamic_properties";
        public static final String DYNAMIC_PROPERTIES = "dynamic_properties";
        /**
         * 动态属性流水号正则校验
         */
        public static final Pattern PROPERTY_NO_PATTERN = Pattern.compile("[a-zA-Z0-9]*");
        public static final String FIELD_ENTITY_CODE = "entity_code";
        /*
         * 动态属性表字段：identifier,property_no,entity_code,property_name,tag_type,derive_type,identifier
         */
        public static final String FIELD_IDENTIFIER = "identifier";
        public static final String FIELD_PROPERTY_NO = "property_no";
        public static final String FIELD_PROPERTY_NAME = "property_name";
        public static final String FIELD_TAG_TYPE = "tag_type";
        public static final String FIELD_DERIVE_TYPE = "derive_type";
        /*
         * 实体测点关联表字段：tag_name，tag_describe，tag_status，binding_type,unit
         */
        public static final String FIELD_TAG_NAME = "tag_name";
        public static final String FIELD_TAG_DESCRIBE = "tag_describe";
        public static final String FIELD_TAG_STATUS = "tag_status";
        public static final String FIELD_BINDING_TYPE = "binding_type";
        public static final String FIELD_UNIT = "unit";

        /**
         *  动态属性自动编号编码
         */
        public static final String DYNAMIC_AUTO_NUMBER_CODE = "dynamicAutoNumber";
        /**
         *  动态属性分支名
         */
        public static final String BRANCHING_DYNAMIC_PROPERTIES = "动态属性";
        /**
         * 导入导出的默认必填字段
         */
        public final static String DEFAULT_REQUIRE_FIELD = "identifier,property_no,entity_code,property_name,tag_type,derive_type";

    }

}
