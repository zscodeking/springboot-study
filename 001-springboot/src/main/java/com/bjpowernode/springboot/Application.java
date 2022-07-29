package com.bjpowernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot项目启动入口类
@SpringBootApplication //SpringBoot核心注解，主要用于开启spring自动配置
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
