package com.imooc.controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.imooc.entity.UserProp;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/16 13:44
 */
@RestController
@RequestMapping("resource2Entity")
public class ResourceMapEntityController {

    @Autowired
    UserProp userProp;

    @RequestMapping("/getUserProp")
    public UserProp getUserProp() {
        UserProp prop = new UserProp();
        BeanUtils.copyProperties(userProp, prop);
        prop.setAge(20);
        return prop;
    }
}
