package com.cn86trading.trading.config;

import com.cn86trading.trading.intercepter.CustomHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.config
 * @ClassName : MyWebMvcConfigurer.java
 * @createTime : 2022/11/2 14:05
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Resource
    private CustomHandlerInterceptor customHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customHandlerInterceptor).addPathPatterns("/*");
    }
}
