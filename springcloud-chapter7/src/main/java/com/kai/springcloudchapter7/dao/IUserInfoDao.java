package com.kai.springcloudchapter7.dao;

import com.kai.springcloudchapter7.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户信息数据访问接口
 * 继承JpaRepository，继承之后就能对数据库进行读写操作（包含了单表查询方法）
 * @author hongok
 * @since 2018-9-13 10:57:13
 */
public interface IUserInfoDao extends JpaRepository<UserInfo,Long> {

    /**
     * 通过用户名获取用户详情
     * @param username 用户详情
     * @return UserInfo
     */
    UserInfo findByUsername(String username);

}
