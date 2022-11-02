package com.cn86trading.trading.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.controller
 * @ClassName : TestFilter.java
 * @createTime : 2022/11/2 13:11
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Slf4j
//@WebFilter(filterName = "testFilter", urlPatterns = {"/*"})
//@WebFilter
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("-------filter.init()-------------");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("customFilter 请求处理之前----doFilter方法之前过滤请求");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        log.info("=================2==================");
        chain.doFilter(request, response);
        log.info("customFilter 请求处理之前----doFilter方法之前过滤请求");
    }

    @Override
    public void destroy() {
        log.info("-------filter.destroy()-------------");
    }
}
