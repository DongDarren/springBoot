package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(UserNotExistException.class)
    public String handlerException(Exception e, HttpServletRequest request){
//        Map<String,Object> map = new HashMap<>();

        request.setAttribute("javax.servlet.error.status_code",500);
//        map.put("code","user.notexist");
//        map.put("message",e.getMessage());
//        request.setAttribute("extra", map);//放在request中的数据，在前端页面中都可以取出来
        return "forward:/error";
    }
}
