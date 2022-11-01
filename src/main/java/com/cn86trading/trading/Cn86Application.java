package com.cn86trading.trading;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan(basePackages = {"com.cn86trading.**.dao"})
//@ImportResource(locations = {"classpath:beans.xml"})
public class Cn86Application {

    public static void main(String[] args) {
        SpringApplication.run(Cn86Application.class, args);
        System.out.println("分支升级");
        System.out.println("--------------");
        System.out.println("-==================");
    }

}
