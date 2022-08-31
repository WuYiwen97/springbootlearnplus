package com.wuyiwen.vo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Data;
import lombok.ToString;
import org.jeasy.random.EasyRandom;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

@Data
@ToString
public class FaWen {

    private Date createTime;
    private Date updateTime;
    private String createId;
    private String updateId;

    private String fawenUser;

    private static People people;


    public static void main(String[] args) {
//        FaWen person = new EasyRandom().nextObject(FaWen.class);
//        System.out.println(person);
//        ShouWen shouWen = new ShouWen();
//        CopyOptions copyOptions = new CopyOptions();
//        Map<String, String> fieldMapping = new HashMap<>();
//        fieldMapping.put("fawenUser","shouWenUser");
//        copyOptions.setFieldMapping(fieldMapping);
//        BeanUtil.copyProperties(person,shouWen,copyOptions);
//        System.out.println(shouWen);
//        String a = "";
//        String[] split = a.split(",");
//        for (String s : split) {
//            System.out.println(s);
//        }

        String formData = "{\"wtdj\":\"0)or(1 = 1\"}";
        Map<String, Object> stringObjectMap = formData2Map(formData);
        System.out.println(stringObjectMap);

        String orgList= "@2323@232@4435@234@432@234@";
        String ddsfasf= "2323,232,4435,234,432,234";
        //String ddsfasf= "2323";
        String[] split = ddsfasf.split(",",-1);
        List<String> strings = Arrays.asList(split);
        String collect = strings.stream().map(e -> "@" + e + "@").collect(Collectors.joining());
        System.out.println(collect);

        String collect1 = Arrays.stream(ddsfasf.split(",", -1)).map(e -> "@" + e + "@").collect(Collectors.joining());
        System.out.println(collect1);
    }


    public static void copyDocument() {

    }

    public static Map<String,Object> formData2Map(String formData){
        Gson gson = new Gson();
        Map<String, Object> map = new HashMap<>();
        try {
            map.putAll(gson.fromJson(formData, new TypeToken<Map<String, Object>>() {}.getType()));
        } catch (Exception e) {
            getUrlParams(formData,map);
        }
        return map;
    }

    public static void getUrlParams(String param, Map<String, Object> map) {
        if (!StringUtils.isEmpty(param)) {
            if (param.contains("&") && param.contains("=")) {
                String[] params = param.split("&");
                for (int i = 0; i < params.length; i++) {
                    String[] p = params[i].split("=");
                    if (p.length == 2) {
                        map.put(p[0], p[1]);
                    }
                }
            } else if (param.contains("=")) {
                String[] p = param.split("=");
                if (p.length == 2) {
                    map.put(p[0], p[1]);
                }
            } else {

            }
        }
    }
}
