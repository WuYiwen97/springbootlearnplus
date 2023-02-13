package com.antaiib.custom.service.version.v3.Impl;

import cn.atfusion.lib.usercontext.UserContext;

import com.antaiib.custom.commons.error.CustomError;

import com.antaiib.commons.exceptions.FsnException;

import com.antaiib.custom.param.v3.FormInfoInParam;

import com.antaiib.custom.service.version.v3.CustomFormInfoServiceV3;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;


/**
 * 自定义表单服务实现层
 *
 * @author yz
 * @date 2021/10/18 17:29
 */
@Service
@Slf4j
public class CustomFormInfoServiceV3Impl implements CustomFormInfoServiceV3 {

    //新增
    @Override
    public Boolean insertFormInfo(UserContext userContext, FormInfoInParam formInfoInParam) {


        //1.保存表单页面信息
        //编码校验
        if(true){
            log.info("表单编码{}", formInfoInParam.getFormCode());
            throw new FsnException(CustomError.CUSTOM_C0024);
        }

        return true;
    }

    private void validateForm() {


    }


}