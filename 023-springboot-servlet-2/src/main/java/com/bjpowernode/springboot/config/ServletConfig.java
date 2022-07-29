package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //该注解将此类定义为配置类，相当于一个xml配置文件
public class ServletConfig {

    //@Bean是一个方法级别上的注解，主要用在配置类上
    //相当于一个
    //<bean>
    //      <bean id="" class="">
    //<bean>
    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean =
                new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return servletRegistrationBean;
    }
}
