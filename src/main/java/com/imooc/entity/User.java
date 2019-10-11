package com.imooc.entity;

import java.util.Date;
import lombok.Data;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/11 13:14
 */
@Data
public class User {

    private String name;
    private int age;
    private String password;
    private Date birthday;
}
