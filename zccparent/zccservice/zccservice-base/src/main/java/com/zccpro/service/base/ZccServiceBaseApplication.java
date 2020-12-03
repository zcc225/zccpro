package com.zccpro.service.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * gitegg-base 启动类
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zccpro")
@ComponentScan(basePackages = "com.zccpro")
@MapperScan("com.zccpro.*.*.mapper")
@SpringBootApplication
public class ZccServiceBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZccServiceBaseApplication.class,args);
    }

}
