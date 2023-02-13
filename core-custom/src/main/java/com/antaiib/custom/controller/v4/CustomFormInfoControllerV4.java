package com.antaiib.custom.controller.v4;

import cn.atfusion.lib.usercontext.UserContext;
//import com.antaiib.commons.exception.FsnException;
//import com.antaiib.commons.result.Result;
//import com.antaiib.commons.result.error.scene.BuildError;
//import com.antaiib.commons.utils.log.OperationLog;
//import com.antaiib.commons.utils.log.OperationLogType;
//import com.antaiib.custom.commons.error.CustomError;
import com.antaiib.commons.result.Result;
import com.antaiib.custom.commons.error.CustomError;
import com.antaiib.custom.data.entity.CustomFormInfo;
import com.antaiib.custom.param.v3.FormInfoInParam;
import com.antaiib.custom.service.version.v3.CustomFormInfoServiceV3;
//import com.antaiib.custom.utils.CTMConstants;
import com.antaiib.custom.utils.CTMConstants;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 自定义表单信息控制层
 *
 * @author yz
 * @date 2021/10/18 17:29
 */

/**
  * 自定义表单信息控制层", description = "用于处理对自定义表单信息的CRUD  
 */
@RestController
@RequestMapping(value = "/v4/form")
public class CustomFormInfoControllerV4 {
    /**
     * 服务对象
     */
    @Resource
    private CustomFormInfoServiceV3 customFormInfoServiceV3;

    /**
     * varchar(255)字段长度
     */
    private static final Integer VARCHAR_255 = 255;



    /**
     * 新增表单信息
     *
     * @param formInfoInParam formInfoInParam
     * @return {@link Result}<{@link Boolean}>
     */
    @PostMapping("/info")
    public Result<Boolean> insertFormInfo(@RequestBody FormInfoInParam formInfoInParam) {
        if (formInfoInParam == null) {
            return Result.failure(Result.PARAMS_ABSENT);
        }
        if(StringUtils.isAnyBlank(formInfoInParam.getFormCode(), formInfoInParam.getFormName())){
            return Result.failure(CustomError.CUSTOM_C0090);
        }

//        if(StringUtils.isAnyBlank(formInfoInParam.getUsePrimaryTableName(), formInfoInParam.getUsePrimaryFieldName())){
//            return Result.failure(CustomError.CUSTOM_C0091);
//        }

        if(ObjectUtils.anyNull(formInfoInParam.getClassifyId())){
            return Result.failure(CustomError.CUSTOM_C0092);
        }

        if (formInfoInParam.getFormCode().length() > VARCHAR_255 || formInfoInParam.getFormName().length() > VARCHAR_255) {
            return Result.failure(CustomError.CUSTOM_C0062);
        }

        if (formInfoInParam.getFormFlag() == null) {
            formInfoInParam.setFormFlag(CTMConstants.form.OLD_FORM_FLAG);
        }
        return Result.success(customFormInfoServiceV3.insertFormInfo(UserContext.get(), formInfoInParam));
    }




}