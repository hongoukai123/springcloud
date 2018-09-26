package com.kai.springcloudchapter5.dao;

import com.kai.springcloudchapter5.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户信息数据访问接口
 * 继承JpaRepository之后就能对数据库进行读写操作，包含了基本的单表查询方法
 */
public interface IUserInfoDao extends JpaRepository<UserInfo, Long> {

    /**
     * 根据用户名从数据库获取用户数据
     * @param username 用户名
     * @return UserInfo用户详情
     */
    UserInfo findByUsername(String username);

}
