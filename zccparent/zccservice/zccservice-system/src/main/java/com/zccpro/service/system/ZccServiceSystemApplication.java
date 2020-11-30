package com.zccpro.service.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


/**
 *
 */
//@EnableDiscoveryClient
@ComponentScan(basePackages = "com.zccpro")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.zccpro.*.*.mapper")
public class ZccServiceSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZccServiceSystemApplication.class,args);
    }
}
