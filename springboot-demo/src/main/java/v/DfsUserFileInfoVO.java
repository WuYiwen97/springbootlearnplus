package v;

import lombok.Data;

import java.util.Date;
@Data
public class DfsUserFileInfoVO {
    private Long id;
    private Long industryId;
    private Long projectId;
    private Long fkDfsFolderId;
    private String name;
    private Long length;
    private String md5;
    private String path;
    private Integer times;
    private Integer width;
    private Integer height;
    private String creatorName;
    private String updaterName;
    private Long createId;
    private Long updateId;
    private Date createTime;
    private Date updaterTime;
}
