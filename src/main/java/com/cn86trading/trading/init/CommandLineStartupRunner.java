package com.cn86trading.trading.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.init
 * @ClassName : CommandLineStartupRunner .java
 * @createTime : 2022/11/2 15:40
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Slf4j
@Component
public class CommandLineStartupRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("CommandLineStartupRunner::传入参数：{}", Arrays.toString(args));
    }
}
