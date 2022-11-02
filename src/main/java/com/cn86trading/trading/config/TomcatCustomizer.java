package com.cn86trading.trading.config;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.config
 * @ClassName : TomcatCustomizer .java
 * @createTime : 2022/11/2 16:28
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Configuration
public class TomcatCustomizer {
    @Bean
    public ConfigurableServletWebServerFactory configurableServletWebServerFactory(){
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addConnectorCustomizers(new MyTomcatConnectionCustomizer());
        return factory;
    }


    static class MyTomcatConnectionCustomizer implements TomcatConnectorCustomizer {

        public MyTomcatConnectionCustomizer() {
        }

        @Override
        public void customize(Connector connector) {
            connector.setPort(Integer.parseInt("8888"));
            connector.setProperty("maxConnections", "8192");
            connector.setProperty("acceptorThreadCount", "100");
            connector.setProperty("minSpareThreads", "10");
            connector.setProperty("maxThreads", "200");
        }
    }
}
