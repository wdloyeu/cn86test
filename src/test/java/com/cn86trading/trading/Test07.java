package com.cn86trading.trading;

import com.cn86trading.trading.model.Employee;
import com.cn86trading.trading.model.Family;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading
 * @ClassName : Test07.java
 * @createTime : 2022/11/1 10:17
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class Test07 {

    @Resource
    private Family family;


    @Resource
    private Employee employee;

    @Test
    public void TestFamily() {
        System.out.println(family.toString());
    }

    @Test
    public void TestProperties() {
        System.out.println(employee.toString());
    }
}
