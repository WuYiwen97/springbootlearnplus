package com.antaiib.custom.service.version.v3;

import cn.atfusion.lib.usercontext.UserContext;
import com.antaiib.custom.data.entity.CustomFormInfo;
import com.antaiib.custom.param.v3.FormInfoInParam;
import com.github.pagehelper.PageInfo;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * 自定义表单信息服务层
 *
 * @author yz
 * @date 2021/10/18 17:29
 */
public interface CustomFormInfoServiceV3 {


    Boolean insertFormInfo(UserContext userContext, FormInfoInParam formInfoInParam);



}