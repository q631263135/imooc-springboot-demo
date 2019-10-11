package com.imooc.controller;

import com.imooc.common.JsonResult;
import com.imooc.entity.User;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/11 13:38
 */
@RestController
// @RestController equals @Controller + @ResponseBody
public class UserRestController {

    @RequestMapping("/getUser3Rest")
    public JsonResult<User> getUser3JsonResult() {
        User u = new User();
        u.setAge(19);
        u.setName("ycz");
        u.setBirthday(new Date());

        return JsonResult.ok(u);
    }
}


