package com.imooc.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/16 13:42
 */
@Configuration
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "test")
@Data
public class UserProp {

    private String name;

    private int age;
}
