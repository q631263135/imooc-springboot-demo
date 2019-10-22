package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/22 13:13
 */
@Controller
@RequestMapping("/exception")
public class TestExceptionController {

    @RequestMapping("/toExceptionPage")
    public String toExceptionPage() {
        System.out.println(1 / 0);
        return "500";
    }

    @RequestMapping("/toIndex")
    public String toIndex() {
        return "th/index";
    }

    @RequestMapping("/ajaxReq")
    public String ajaxReq() {
        return "th/ajax.html";
    }

    @RequestMapping("/ajaxError")
    @ResponseBody
    public Object ajaxError() {
        System.out.println(1 / 0);
        return null;
    }
}
