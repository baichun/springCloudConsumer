package com.uxun.bc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by 欧阳爱东 on 2018/2/8.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
