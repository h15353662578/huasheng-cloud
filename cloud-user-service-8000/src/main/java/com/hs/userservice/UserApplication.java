package com.hs.userservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author 华生
 * 2020/12/26
 */

@RefreshScope
@EnableDiscoveryClient
@EnableDubbo
@SpringBootApplication
/***
 * 跨域
 * CrossOrigin
 */
//@CrossOrigin
/***
 * @author 华生
 * 用户操作
 * UserApplication
 */
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
