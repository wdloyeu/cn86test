package com.cn86trading.trading.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.exception
 * @ClassName : CustomExceptionType .java
 * @createTime : 2022/11/2 17:08
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public enum CustomExceptionType {

    USER_INPUT_ERROR(400,"您输入的数据错误或您没有权限访问资源！"),
    SYSTEM_ERROR (500,"系统出现异常，请您稍后再试或联系管理员！"),
    OTHER_ERROR(888,"系统出现未知异常，请联系管理员！");

    private String desc;
    private int code;

    CustomExceptionType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getCode() {
        return this.code;
    }
}
