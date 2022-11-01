package com.cn86trading.trading;

import com.cn86trading.trading.service.TestBeanService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading
 * @ClassName : Test06.java
 * @createTime : 2022/10/31 23:08
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ExtendWith(SpringExtension.class)
public class Test06 {

    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    public void testImport() throws Exception {
        boolean isImport = ioc.containsBean("testBeanService");
        System.out.println(isImport);
    }
}
