package com.cn86trading.trading;

import com.cn86trading.trading.listener.MyListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages = {"com.cn86trading.**.dao"})
//@ImportResource(locations = {"classpath:beans.xml"})
public class Cn86Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Cn86Application.class, args);
        context.addApplicationListener(new MyListener());
        System.out.println("分支升级");
        System.out.println("--------------");
        System.out.println("-==================");
    }

}
