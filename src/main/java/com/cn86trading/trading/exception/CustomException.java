package com.cn86trading.trading.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.exception
 * @ClassName : CustomException .java
 * @createTime : 2022/11/2 17:13
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class CustomException extends RuntimeException {
    //异常错误编码
    private int code ;
    //异常信息
    private String message;

    public CustomException() {
    }

    public CustomException(CustomExceptionType customExceptionType) {
        this.code = customExceptionType.getCode();
        this.message = customExceptionType.getDesc();
    }

    public CustomException(CustomExceptionType customExceptionType, String message) {
        this.code = customExceptionType.getCode();
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
