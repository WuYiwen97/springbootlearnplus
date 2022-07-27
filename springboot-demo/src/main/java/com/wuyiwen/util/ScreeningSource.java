package com.wuyiwen.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@Configuration
public class ScreeningSource {
    @Bean
    public ScreeningSource scree(){
        System.out.println("ScreeningSource");
        return null;
    }
}