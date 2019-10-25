package com.imooc.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
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
    @JsonInclude(Include.NON_NULL)
    private String password;
    private Date birthday;

    @JsonInclude(Include.NON_NULL)
    private String desc;
}
