package com.cn86trading.trading.service;

import com.cn86trading.trading.exception.CustomException;
import com.cn86trading.trading.exception.CustomExceptionType;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.service
 * @ClassName : ExceptionService .java
 * @createTime : 2022/11/2 18:00
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Service
public class ExceptionService {
    //服务层，模拟系统异常
    public void systemBizError() {
        try {
            Class.forName("com.mysql.jdbc.xxxx.Driver");
        } catch (ClassNotFoundException e) {
            throw new CustomException(
                    CustomExceptionType.SYSTEM_ERROR,
                    "在XXX业务，myBiz()方法内，出现ClassNotFoundException，请将该信息告知管理员");
        }
    }

    //服务层，模拟用户输入数据导致的校验异常
    public void userBizError(int input)  {
        Assert.isTrue(input >= 0,"您输入的数据不符合业务逻辑，请确认后重新输入！");
        if(input < 0){ //模拟业务校验失败逻辑
            throw new CustomException(
                    CustomExceptionType.USER_INPUT_ERROR,
                    "您输入的数据不符合业务逻辑，请确认后重新输入！");
        }

        //…… 其他的业务
    }
}
