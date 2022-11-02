package com.cn86trading.trading.controller;

import com.cn86trading.trading.event.MyEvent;
import com.cn86trading.trading.service.ExceptionService;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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

    @Resource
    private ApplicationContext applicationContext;

    @Resource
    private ExceptionService exceptionService;

    private String name;
    @RequestMapping("/hello")
    public String hello(String name) {
        return "helol:  "+name;
    }

    @RequestMapping("/testRequest")
    public void testListener(HttpServletRequest request, String name) {

        request.setAttribute("name", name);
        request.getAttribute("name");
        request.removeAttribute("name");
    }

    @GetMapping("/helloEvent")
    public String helloEvent() {
        applicationContext.publishEvent(new MyEvent("测试时间！！"));
        return "publish Event success";
    }

    @GetMapping("testException")
    public void testException (int id) {
        if (id == 1) {
            exceptionService.systemBizError();
        } else {
            exceptionService.userBizError(id);
        }
    }
}
