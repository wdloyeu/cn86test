package com.cn86trading.trading.config;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.config
 * @ClassName : ModelView .java
 * @createTime : 2022/11/2 22:02
 * @公众号 : 小黑侠
 * @Description :
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})//只能在方法上使用此注解
public @interface ModelView {
}
