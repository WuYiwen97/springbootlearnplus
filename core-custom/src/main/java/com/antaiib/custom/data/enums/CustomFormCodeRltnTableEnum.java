package com.antaiib.custom.data.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

/**
 *
 * 提供表单模板对应的数据表
 *
 * @author wyw
 * @date 2022/09/26
 */
@AllArgsConstructor
@Getter
public enum CustomFormCodeRltnTableEnum {

    /**--------------------------发文基础设置-----------------------------**/

    /**
     * 发文-公文域设置
     */
    GW_SF_OFFICIAL_FIELD("GW_SF_OFFICIAL_FIELD", "document_offical_field"),
    /**
     * 机关代字
     */
    GW_SF_SEND_ORG_ALIAS("GW_SF_SEND_ORG_ALIAS", "document_send_org_alias"),
    /**
     * 文号
     */
    GW_SF_SEND_WORD_NUM("GW_SF_SEND_WORD_NUM", "document_send_word_num"),
    /**
     * 组织收文员
     */
    GW_SF_SEND_MEMBER("GW_SF_SEND_MEMBER", "document_send_member"),
    /**
     * 发文基础设置表
     */
    GW_SF_SEND_BASEINFO("GW_SF_SEND_BASEINFO", "document_send_baseinfo"),
    /**
     * 人员关系表
     */
    GW_SF_USER_RELATIONS("GW_SF_USER_RELATIONS", "document_user_relations"),
    /**
     * 发文正文签章表
     */
    GW_SF_SIGNATURE("GW_SF_SIGNATURE", "document_signature"),

    /**--------------------------收文基础设置-----------------------------**/

    /**
     * 收文流水号
     */
    GW_RF_RECEIVE_NUM("GW_RF_RECEIVE_NUM", "document_receive_num"),
    /**
     * 收文基础设置表
     */
    GW_RF_RECEIVE_BASEINFO("GW_RF_RECEIVE_BASEINFO", "document_receive_baseinfo"),
    /**
     * 收文单位设置表
     */
    GW_RF_RECEIVE_UNIT("GW_RF_RECEIVE_UNIT", "document_receive_unit");


    /**--------------------------收文详情设置-----------------------------**/

    /**--------------------------收文详情设置-----------------------------**/

    /**
     * 表单编码
     */
    private final String formCode;
    /**
     * 表名
     */
    private final String tableName;

    public static Optional<CustomFormCodeRltnTableEnum> getRltnTableEnum(String formCode) {
        return Arrays.stream(CustomFormCodeRltnTableEnum.values()).filter(c -> c.getFormCode().equals(formCode)).findFirst();
    }

    public static Optional<CustomFormCodeRltnTableEnum> of(String tableName) {
        return Arrays.stream(CustomFormCodeRltnTableEnum.values()).filter(c -> c.getTableName().equals(tableName)).findFirst();
    }
}
