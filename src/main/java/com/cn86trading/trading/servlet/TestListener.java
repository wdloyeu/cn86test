package com.cn86trading.trading.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.controller
 * @ClassName : TestListener.java
 * @createTime : 2022/11/2 13:13
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Slf4j
@WebListener
public class TestListener implements ServletContextListener
                                    , HttpSessionListener
                                    , ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("-----------context创建-------------- ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("-----------context销毁------------- ");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        log.info("-----------request添加属性-------------- ");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        log.info("-----------request删除属性-------------- ");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        log.info("-----------request修改属性-------------- ");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("-----------request销毁-------------- ");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("-----------request初始化-------------- ");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("-----------sessionCreated创建-------------- ");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("-----------sessionCreated销毁-------------- ");
    }
}
