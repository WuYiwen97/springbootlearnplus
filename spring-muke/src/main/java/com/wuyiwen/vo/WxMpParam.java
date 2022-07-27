package com.wuyiwen.vo;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 微信公众号参数
 * EnableConfigurationProperties注解的作用是：使 使用 @ConfigurationProperties 注解的类生效。
 */

//@Component //注册为组件
//@EnableConfigurationProperties // 启用配置自动注入功能
//@Data
//@ConfigurationProperties(prefix = "wxmp") // 指定类对应的配置项前缀
//public class WxMpParam {
//    private String appid;// 对应到wxmp.appid
//    private String secret; // 对应到wxmp.secret
//    //省略 get set
//}

/**
 * 微信公众号参数
 */
@Data
@Component // 注册为组件
@PropertySource(value = "classpath:wxmp.properties", encoding = "utf-8") // 指定配置文件及编码
public class WxMpParam {
    @Value("${wxmp.appid}")
    private String appid;
    @Value("${wxmp.secret}")
    private String secret;
}