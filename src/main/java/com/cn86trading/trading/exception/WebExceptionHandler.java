package com.cn86trading.trading.exception;

import com.cn86trading.trading.model.AjaxResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.exception
 * @ClassName : WebExceptionHandler .java
 * @createTime : 2022/11/2 20:23
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
//所有Controller异常处理
@ControllerAdvice
public class WebExceptionHandler {

    //处理程序员主动转换的自定义异常
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public AjaxResponse customerException(CustomException e) {
        if(e.getCode() == CustomExceptionType.SYSTEM_ERROR.getCode()){
            //400异常不需要持久化，将异常信息以友好的方式告知用户就可以
            //TODO 将500异常信息持久化处理，方便运维人员处理
        }
        return AjaxResponse.error(e);
    }

    //处理程序员在程序中未能捕获（遗漏的）异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public AjaxResponse exception(Exception e) {
        //TODO 将异常信息持久化处理，方便运维人员处理

        return AjaxResponse.error(new CustomException(
                CustomExceptionType.OTHER_ERROR));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public AjaxResponse handleBindException(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        return AjaxResponse.error(new CustomException(CustomExceptionType.USER_INPUT_ERROR,
                fieldError.getDefaultMessage()));
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public AjaxResponse handleBindException(BindException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        return AjaxResponse.error(new CustomException(CustomExceptionType.USER_INPUT_ERROR,
                fieldError.getDefaultMessage()));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public AjaxResponse handleIllegalArgumentException(IllegalArgumentException e) {
        return AjaxResponse.error(
                new CustomException(CustomExceptionType.USER_INPUT_ERROR,
                        e.getMessage())
        );
    }

    @ExceptionHandler(ModelViewException.class)
    public ModelAndView viewExceptionHandler(HttpServletRequest req, ModelViewException e) {
        ModelAndView modelAndView = new ModelAndView();

        //将异常信息设置如modelAndView
        modelAndView.addObject("exception", e);
        modelAndView.addObject("url", req.getRequestURL());
        modelAndView.setViewName("error");

        //返回ModelAndView
        return modelAndView;
    }
}
