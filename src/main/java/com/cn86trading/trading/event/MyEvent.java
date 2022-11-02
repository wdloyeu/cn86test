package com.cn86trading.trading.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.event
 * @ClassName : MyEvent.java
 * @createTime : 2022/11/2 14:28
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@SuppressWarnings("serial")
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}
