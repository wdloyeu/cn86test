package com.cn86trading.trading.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.servlet
 * @ClassName : CustomFilter.java
 * @createTime : 2022/11/2 13:34
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Slf4j
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("=============CustomFilter.init()=================");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("=================1==================");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("=============CustomFilter.destroy()=================");
    }
}
