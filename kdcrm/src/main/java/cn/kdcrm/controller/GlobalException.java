package cn.kdcrm.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class GlobalException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        System.out.println("global");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        System.out.println("ex---"+e.toString());
        mv.addObject("msg", e.toString());
        return mv;
    }
}
