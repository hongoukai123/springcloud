package com.kai.springcloudchapter7.entity;

import javax.persistence.*;

/**
 * 用户信息实体类
 * Entity表明该类是实体类
 * @author hongok
 * @since 2018-9-13 10:49:49
 */
@Entity
public class UserInfo {

    /**
     * 主键id(自动增长，增量1)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名（不能为空，并且唯一约束）
     */
    @Column(nullable = false, unique = true)
    private String username;

    /**
     * 密码
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
