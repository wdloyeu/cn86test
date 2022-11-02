package com.cn86trading.trading.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.config
 * @ClassName : BeanRunner .java
 * @createTime : 2022/11/2 15:43
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Slf4j
@Configuration
public class BeanRunner {

    @Bean
    @Order(1)
    public CommandLineRunner runner1() {
        return new CommandLineRunner(){

            @Override
            public void run(String... args) throws Exception {
                log.info("BeanCommandLineRunner run1()参数：{}", Arrays.toString(args));
            }
        };
    }

    @Bean
    @Order(2)
    public CommandLineRunner runner2(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args){
                log.info("BeanCommandLineRunner run2()+{}" , Arrays.toString(args));
            }
        };
    }

    @Bean
    @Order(3)
    public ApplicationRunner runner3(){
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args){
                log.info("BeanApplicationRunner run3() + {}", Arrays.toString(args.getSourceArgs()));
            }
        };
    }
}
