package com.wuyiwen.service;

import com.wuyiwen.vo.FaWen;
import com.wuyiwen.vo.ShouWen;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

	
//	@Mapping(target = "name", source = "personName")
//	@Mapping(target = "id", ignore = true) // 忽略id，不进行映射
    ShouWen converTOShouWen(FaWen person);

}