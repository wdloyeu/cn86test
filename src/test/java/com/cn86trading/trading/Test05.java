package com.cn86trading.trading;

import com.cn86trading.trading.controller.HelloController;
import com.cn86trading.trading.controller.TestController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading
 * @ClassName : Test05.java
 * @createTime : 2022/10/29 13:21
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Slf4j
@AutoConfigureMockMvc

@WebMvcTest({HelloController.class, TestController.class})
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class Test05 {


}
