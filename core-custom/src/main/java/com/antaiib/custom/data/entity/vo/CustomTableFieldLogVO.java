package com.antaiib.custom.data.entity.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author zhangzr
 * @date 2022-01-19 16:33
 **/
@Data
public class CustomTableFieldLogVO {

    private Long appId;
    private String databaseName;
    private String tableName;
    private Date startTime;
    private Date endTime;
    private String operateType;
    private String databaseType;
    private String[] ids;

    private Integer pageNum;
    private Integer pageSize;
}
