package com.bjpowernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot项目启动入口类
@SpringBootApplication  //开启SpringBoot配置
public class Application {

    //SpringBoot项目代码必须放到Application类所在的同级目录或下级目录

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
