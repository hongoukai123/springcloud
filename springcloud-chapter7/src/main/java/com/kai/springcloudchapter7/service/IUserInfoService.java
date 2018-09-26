package com.kai.springcloudchapter7.service;

import com.kai.springcloudchapter7.entity.UserInfo;

/**
 * 用户信息业务访问层接口类
 * @author hongok
 * @since 2018-9-13 10:59:10
 */
public interface IUserInfoService {

    /**
     * 通过用户名获取用户详情
     * @param username 用户详情
     * @return UserInfo
     */
    UserInfo findByUsername(String username);

    /**
     * 添加用户信息(如果修改的id必須传入)
     * @param userInfo 用户信息
     * @return
     */
    String save(UserInfo userInfo);

    /**
     * 根据用户名删除用户对象
     * @param username 用户名
     * @return
     */
    String delete(String username);

}
