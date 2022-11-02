package com.cn86trading.trading.service;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.service
 * @ClassName : TestBeanService.java
 * @createTime : 2022/10/31 23:02
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Service
public class TestBeanService {

    public void printString(String name) {
        System.out.println("你好好！！" + name);
    }
}
