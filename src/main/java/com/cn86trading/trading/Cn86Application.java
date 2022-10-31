package com.cn86trading.trading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cn86Application {

    public static void main(String[] args) {
        SpringApplication.run(Cn86Application.class, args);
        System.out.println("分支升级");
    }

}
