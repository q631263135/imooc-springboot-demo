package com.imooc.controller;

import com.imooc.entity.User;
import java.util.Calendar;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/17 13:12
 */
@Controller
@RequestMapping("/th")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index() {
        return "/th/index";
    }

    @RequestMapping("/test")
    public String test(ModelMap map) {
        User user = new User();
        user.setName("zwj");
        user.setAge(18);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 0, 1);
        user.setBirthday(calendar.getTime());
        user.setDesc("<p style='color: red'>身材一级棒</p>");

        map.addAttribute(user);
        return "/th/test";
    }

    @RequestMapping(value = "/postform", method = RequestMethod.POST)
    public String postform(User user) {

        System.out.println(user.getName());
        return "redirect:/th/test";
    }
}

