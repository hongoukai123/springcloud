package com.kai.springcloudchapter2.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 将配置文件的属性赋给实体类ConfigBean
 * ConfigurationProperties指向application.yml
 * prefix指向application.yml中的user
 * Component注解，SpringBoot在启动程序时通过包扫描将该类作为一个Bean注入IOC容器中
 * @author hongok
 * @since 2018-9-10 14:34:22
 */
@ConfigurationProperties(prefix = "user")
@Component
public class ConfigBean {

    private String name;

    private int age;

    private int number;

    private String uuid;

    private int max;

    private String value;

    private String greeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
