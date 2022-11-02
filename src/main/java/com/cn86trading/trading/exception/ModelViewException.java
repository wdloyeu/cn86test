package com.cn86trading.trading.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.exception
 * @ClassName : ModelViewException .java
 * @createTime : 2022/11/2 22:08
 * @公众号 : 小黑侠
 * @Description :
 */
public class ModelViewException extends RuntimeException{
    //将Exception 转换为ModelViewException
    public static ModelViewException transfer(Throwable cause) {
        return new ModelViewException(cause);
    }

    private ModelViewException(Throwable cause) {
        super(cause);
    }
}
