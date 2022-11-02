package com.cn86trading.trading.config;

import com.cn86trading.trading.exception.ModelViewException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.config
 * @ClassName : ModelViewAspect .java
 * @createTime : 2022/11/2 22:06
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Slf4j
@Aspect
@Component
public class ModelViewAspect {

    //设置切入点：这里直接拦截被@ModelView注解的方法
    @Pointcut("@annotation(com.cn86trading.trading.config.ModelView)")
    public void pointcut() { }

    /**
     * 当有ModelView的注解的方法抛出异常的时候，做如下的处理
     */
    @AfterThrowing(pointcut="pointcut()",throwing="e")
    public void afterThrowable(Throwable e) {
        throw ModelViewException.transfer(e);
    }
}
