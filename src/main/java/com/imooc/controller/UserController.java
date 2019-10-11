package com.imooc.controller;

import com.imooc.common.JsonResult;
import com.imooc.entity.User;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/11 13:16
 */
@Controller
public class UserController {

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser() {
        User u = new User();
        u.setAge(18);
        u.setName("zwj");
        u.setBirthday(new Date());
        u.setPassword(null);

        return u;
    }

    @RequestMapping("/getUser3JsonResult")
    @ResponseBody
    public JsonResult<User> getUser3JsonResult() {
        User u = new User();
        u.setAge(18);
        u.setName("zwj");
        u.setBirthday(new Date());
        u.setPassword(null);

        return JsonResult.ok(u);
    }

}
