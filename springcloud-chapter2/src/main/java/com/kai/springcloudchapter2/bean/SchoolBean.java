package com.kai.springcloudchapter2.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 将配置文件中的属性和属性值赋给一个SchoolBean（JavaBean）
 * Configuration注解，定义配置类，可替换XML配置文件，被注解的类内部包含有一个或多个被@Bean注解的方法，
 * 这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描，
 * 并用于构建bean定义，初始化Spring容器。
 * Configuration注解，加载指定的配置文件
 * ConfigurationProperties注解，加载指定配置文件中的包
 * @author hongok
 * @since 2018-9-10 15:07:30
 */
@Configuration
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.kai")
public class SchoolBean {

    private String schName;

    private int number;

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
