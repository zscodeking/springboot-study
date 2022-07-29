package com.bjpowernode.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        //获取SpringBoot类
        SpringApplication springApplication = new SpringApplication(Application.class);

        //设置它的属性
        springApplication.setBannerMode(Banner.Mode.OFF);

        springApplication.run(args);
    }

}
