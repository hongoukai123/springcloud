package com.kai.springcloudchapter2.controller;

import com.kai.springcloudchapter2.bean.SchoolBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试调用test.properties文件属性和属性值赋给SchoolBean后的对象
 * EnableConfigurationProperties注解，加载SchoolBean
 * @author hongok
 * @since 2018-9-10 15:14:49
 */
@RestController
@EnableConfigurationProperties({SchoolBean.class})
public class SchoolController {

    @Autowired
    SchoolBean schoolBean;

    @RequestMapping("/get/school")
    public String getSchool(){
        return schoolBean.getSchName() + "<--->" + schoolBean.getNumber();
    }

}
