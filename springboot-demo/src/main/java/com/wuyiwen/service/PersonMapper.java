package com.wuyiwen.service;

import v.FaWen;
import v.ShouWen;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

	
//	@Mapping(target = "name", source = "personName")
//	@Mapping(target = "id", ignore = true) // 忽略id，不进行映射
    ShouWen converTOShouWen(FaWen person);

}