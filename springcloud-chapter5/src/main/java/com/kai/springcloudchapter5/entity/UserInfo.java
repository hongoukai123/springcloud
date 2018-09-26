package com.kai.springcloudchapter5.entity;

import javax.persistence.*;

/**
 * 用户信息实体类
 * Entity注解，表明该类似一个实体类，和数据库的表名称相对应
 * @author hongok
 * @since 2018-9-11 09:36:36
 */
@Entity
public class UserInfo {

    /**
     * Id注解表明该变量对应于数据库中的id
     * GeneratedValue注解表明该字段为自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     * Column注解对应于数据库表中的字段
     * nullable = false表明该字段不能为空
     * unique = true表明该字段对应于数据库表中的字段为唯一约束
     */
    @Column(nullable = false, unique = true)
    private String username;

    /**
     * 密码
     * Column注解对应于数据库表中的字段
     */
    @Column
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
