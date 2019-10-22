package com.imooc.common;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/22 18:34
 */
@RestControllerAdvice
public class RestExceptonHandler {

    @ExceptionHandler(value = Exception.class)
    public JsonResult handleRestException(HttpServletRequest req, Exception e) {

        e.printStackTrace();
        return JsonResult.error(e.getMessage());
    }
}
