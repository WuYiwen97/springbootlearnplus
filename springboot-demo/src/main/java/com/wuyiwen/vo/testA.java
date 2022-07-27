package com.wuyiwen.vo;

import com.wuyiwen.service.PersonMapper;
import org.jeasy.random.EasyRandom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public class testA {

    public static void main(String[] args) {
        FaWen person = new EasyRandom().nextObject(FaWen.class);
        System.out.println(person);
        PersonMapper mapper = Mappers.getMapper(PersonMapper.class);
        ShouWen conver = mapper.converTOShouWen(person);
        System.out.println(conver);
    }
}
