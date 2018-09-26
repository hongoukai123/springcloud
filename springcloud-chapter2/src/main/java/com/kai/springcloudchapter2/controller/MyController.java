package com.kai.springcloudchapter2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试将application.yml文件中的my中的属性值赋给此处的name、age
 * Value注解是为了引入application.yml属性
 * 在变量上加上@Value("${属性名}"),就可以将配置文件application.yml 的一个属性值赋给一个变量
 * @author hongok
 * @since 2018-9-10 14:38:37
 */
@RestController
public class MyController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    @RequestMapping("/index")
    public String index(){
        return name + ":" + age;
    }

}
