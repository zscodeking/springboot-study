package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //定义此类为配置类
public class FilterConfig {

    @Bean
    public FilterRegistrationBean myFilterRegistrationBean(){

        FilterRegistrationBean filterRegistrationBean =
                new FilterRegistrationBean(new MyFilter());

        filterRegistrationBean.addUrlPatterns("/user/*");

        return filterRegistrationBean;
    }

}
