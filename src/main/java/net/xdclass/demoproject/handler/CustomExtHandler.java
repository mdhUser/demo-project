package net.xdclass.demoproject.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: demo-project
 * @description: 标记这是一个异常处理类
 * @author: mdh
 * @create: 2022-01-20 18:37
 **/
@RestControllerAdvice
//@ExceptionHandler(value = Exception.class)
public class CustomExtHandler {

    @ExceptionHandler(value = Exception.class)
    Object handlerException(Exception e, HttpServletRequest request) {

        ModelAndView model = new ModelAndView();
        model.setViewName("error.html");
        model.addObject("msg", e.getMessage());
        return model;
    }

}
