package com.cn86trading.trading.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.controller
 * @ClassName : HelloController.java
 * @createTime : 2022/10/12 9:16
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@RestController
@Data
public class HelloController {

    private String name;
    @RequestMapping("/hello")
    public String hello(String name) {
        return "helol:  "+name;
    }
}
