package com.cn86trading.trading.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.init
 * @ClassName : AppStartupRunner .java
 * @createTime : 2022/11/2 15:41
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Slf4j
@Component
public class AppStartupRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("AppStartupRunner::参数名称：{}", args.getOptionNames());
        log.info("AppStartupRunner::参数值：{}", args.getOptionValues("age"));
        log.info("AppStartupRunner::参数：{}", Arrays.toString(args.getSourceArgs()));
    }
}
