package com.wuyiwen.vo;

import cn.hutool.core.map.MapUtil;
import com.wuyiwen.service.PersonMapper;
import org.jeasy.random.EasyRandom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.HashMap;
import java.util.Map;

public class testA {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 24);
        Long rootLevel =  (long) (map.getOrDefault("level", -1L));
        int i = 1;
        System.out.println((long)Integer.valueOf(i));
        System.out.println((long)i);
        System.out.println(map.get("id"));
        System.out.println(MapUtil.getLong(map, "id"));
        //System.out.println((long)map.get("id"));


        Integer integer = Integer.valueOf(i);
        long a  = (long) integer;
        System.out.println(a);
    }

}
