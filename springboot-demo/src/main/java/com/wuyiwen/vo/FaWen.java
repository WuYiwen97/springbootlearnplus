package com.wuyiwen.vo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;
import lombok.ToString;
import org.jeasy.random.EasyRandom;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
@ToString
public class FaWen {

    private Date createTime;
    private Date updateTime;
    private String createId;
    private String updateId;

    private String fawenUser;


    public static void main(String[] args) {
        FaWen person = new EasyRandom().nextObject(FaWen.class);
        System.out.println(person);
        ShouWen shouWen = new ShouWen();
        CopyOptions copyOptions = new CopyOptions();
        Map<String, String> fieldMapping = new HashMap<>();
        fieldMapping.put("fawenUser","shouWenUser");
        copyOptions.setFieldMapping(fieldMapping);
        BeanUtil.copyProperties(person,shouWen,copyOptions);
        System.out.println(shouWen);
    }


    public static void copyDocument() {

    }
}
