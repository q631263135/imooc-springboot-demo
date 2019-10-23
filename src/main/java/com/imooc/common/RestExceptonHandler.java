package com.imooc.common;

import com.imooc.utils.WebUtil;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/22 18:34
 */
@RestControllerAdvice
public class RestExceptonHandler {

    public static final String ERROR_PAGE = "500";

    @ExceptionHandler(value = Exception.class)
    public Object handleRestException(HttpServletRequest req, Exception e) {
        e.printStackTrace();

        if (WebUtil.isAjax(req)) {
            return JsonResult.error(e.getMessage());
        } else {
            ModelAndView mv = new ModelAndView();
            mv.addObject("exception", e);
            mv.addObject("url", req.getRequestURL());
            mv.setViewName(ERROR_PAGE);
            return mv;
        }

    }
}
