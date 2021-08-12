package cn.kdcrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class CustomExtHandler {
    /*   @ExceptionHandler(value = Exception.class)
   @ResponseBody
   public Map<String,String> exceptionHandler(Exception ex)
   {
       Map<String,String>  map=new HashMap<>();
       map.put("code","102");
       map.put("msg",ex.getMessage());
       return map;
   }
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exceptionHandler(Exception ex)
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("msg",ex);
        modelAndView.setViewName("error");
        return modelAndView;
    }*/
}
