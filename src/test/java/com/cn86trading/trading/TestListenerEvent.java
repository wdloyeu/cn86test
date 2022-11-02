package com.cn86trading.trading;

import com.cn86trading.trading.event.MyEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading
 * @ClassName : TestListenerEvent.java
 * @createTime : 2022/11/2 14:43
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestListenerEvent {

    @Resource
    private ApplicationContext applicationContext;

    @Test
    public void testListenerEvent() {
        applicationContext.publishEvent(new MyEvent("测试时间！！"));
    }
}
