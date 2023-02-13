package com.antaiib.custom;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import java.util.Collections;


//@ServletComponentScan
//向服务中心注册
//@EnableDiscoveryClient
//@SpringBootApplication(scanBasePackages = {"com.antaiib.custom.data.utils", "com.antaiib.custom.data.datasource", "com.antaiib.*", "cn.atfusion.lib.*"}, exclude = {DataSourceAutoConfiguration.class})
@EnableTransactionManagement
//加入dubbo
//@EnableDubbo
@EnableScheduling
@EnableAsync

//@MapperScan({"com.antaiib.commons.seq"})


@SpringBootApplication(scanBasePackages = {"com.antaiib.custom.data.utils", "com.antaiib.*", "cn.atfusion.lib.*"})
public class CoreCustomApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoreCustomApplication.class, args);
    }
}
