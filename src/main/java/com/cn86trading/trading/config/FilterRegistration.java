package com.cn86trading.trading.config;

import com.cn86trading.trading.servlet.CustomFilter;
import com.cn86trading.trading.servlet.TestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.config
 * @ClassName : FilterRegistration.java
 * @createTime : 2022/11/2 13:27
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Configuration
public class FilterRegistration {

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean<TestFilter>();
        registration.setFilter(new TestFilter());
        registration.setName("testFilter");
        registration.addUrlPatterns("/*");
        registration.setOrder(2);
        return registration;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean2() {
        FilterRegistrationBean registration = new FilterRegistrationBean<CustomFilter>();
        registration.setFilter(new CustomFilter());
        registration.setName("customFilter");
        registration.addUrlPatterns("/*");
        registration.setOrder(6);
        return registration;
    }
}
