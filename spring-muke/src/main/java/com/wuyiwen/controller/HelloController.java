package com.wuyiwen.controller;

import com.wuyiwen.vo.WxMpParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController // 标注为控制器，且返回值序列化为json
public class HelloController {

	@Autowired
	private WxMpParam wxMpParam;

	@GetMapping("/hello") // 响应get请求，匹配的请求路径为/hello
	public Map hello() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("appid",wxMpParam.getAppid());
		map.put("secret",wxMpParam.getSecret());
		return map;
	}


}
