package com.imooc.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/22 13:05
 */
@ControllerAdvice
public class DefaultExceptionHandler {

    public static final String ERROR_PAGE = "500";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView handleException(HttpServletRequest req, HttpServletResponse resp, Exception e) {
        e.printStackTrace();

        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", e);
        mv.addObject("url", req.getRequestURL());
        mv.setViewName(ERROR_PAGE);
        return mv;
    }

}
