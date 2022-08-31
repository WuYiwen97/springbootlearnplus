package com;

import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mapper")
public class MybatisPlusMainApp {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusMainApp.class);
    }
}

