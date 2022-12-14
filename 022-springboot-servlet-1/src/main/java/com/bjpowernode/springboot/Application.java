package com.bjpowernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication //开启Spring配置
@ServletComponentScan(basePackages = "com.bjpowernode.springboot.servlet")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
