package com.kai.springcloudchapter2.controller;

import com.kai.springcloudchapter2.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试将application.yml中的user赋值给ConfigBean对象后在此使用
 * EnableConfigurationProperties({ConfigBean.class})注解，引入配置的ConfigBean
 * @author hongok
 * @since 2018-9-10 14:41:32
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class UserController {

    @Autowired
    ConfigBean configBean;

    @RequestMapping("/hello/bean")
    public String helloBean(){
        return configBean.getGreeting() + "<--->" + configBean.getName() + "<--->" + configBean.getUuid() + "<--->" + configBean.getMax();
    }

}
