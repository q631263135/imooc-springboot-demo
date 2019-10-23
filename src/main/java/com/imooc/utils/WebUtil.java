package com.imooc.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/23 13:51
 */
public class WebUtil {
    private static final String XML_HTTP_REQUEST = "XMLHttpRequest";
    private static final String X_REQUESTED_WITH = "X-Requested-With";

    public static boolean isAjax(HttpServletRequest request) {
        return XML_HTTP_REQUEST.equals(request.getHeader(X_REQUESTED_WITH));
    }
}