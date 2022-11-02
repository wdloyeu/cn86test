package com.cn86trading.trading.exception;

import com.cn86trading.trading.model.AjaxResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.exception
 * @ClassName : GlobalResponseAdvice .java
 * @createTime : 2022/11/2 18:00
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Component
//监听所有Controller异常
@ControllerAdvice
//实现ResponseBodyAdvice 接口的作用是：在将数据返回给用户之前，做最后一步的处理。
// 也就是说，ResponseBodyAdvice 的处理过程在全局异常处理的后面。
public class GlobalResponseAdvice implements ResponseBodyAdvice {

    //support表示支持哪些响应类，true代表所有。
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body,
                                  MethodParameter methodParameter,
                                  MediaType mediaType,
                                  Class aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        //如果响应结果是JSON数据类型
        if(mediaType.equalsTypeAndSubtype(
                MediaType.APPLICATION_JSON)){
            if(body instanceof AjaxResponse){
                AjaxResponse ajaxResponse = (AjaxResponse)body;
                if(ajaxResponse.getCode() != 888){ //888 不是标准的HTTP状态码，特殊处理
                    serverHttpResponse.setStatusCode(HttpStatus.valueOf(
                            ajaxResponse.getCode()
                    ));
                }

                return body;
            }else{
                serverHttpResponse.setStatusCode(HttpStatus.OK);
                return AjaxResponse.success(body);
            }

        }


        return body;
    }
}
