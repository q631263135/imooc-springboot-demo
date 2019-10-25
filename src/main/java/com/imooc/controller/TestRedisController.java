package com.imooc.controller;

import com.imooc.common.JsonResult;
import com.imooc.entity.User;
import com.imooc.utils.JsonUtils;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/24 13:23
 */
@RestController
@RequestMapping("/redis")
public class TestRedisController {

    @Autowired
    private StringRedisTemplate strRedis;

    @RequestMapping("/testRedis")
    public JsonResult testRedis() {
        strRedis.opsForValue().set("yangchaozheng", "big man");
        return JsonResult.ok(strRedis.opsForValue().get("yangchaozheng"));
    }

    @RequestMapping("/testRedisJson")
    public void testRedisJson() {
        User u = new User();
        u.setAge(18);
        u.setName("zwj");
        u.setBirthday(new Date());
        u.setPassword(null);

        strRedis.opsForValue().set("json:user", JsonUtils.objectToJson(u));
    }
}
