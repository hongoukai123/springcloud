package com.kai.springcloudchapter7.service.impl;

import com.kai.springcloudchapter7.dao.IUserInfoDao;
import com.kai.springcloudchapter7.entity.UserInfo;
import com.kai.springcloudchapter7.service.IUserInfoService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息业务访问层实现类
 * Service注解，表明该类是业务实现类
 * @author hongok
 * @since 2018-9-13 11:01:39
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private IUserInfoDao userInfoDao;

    /**
     * 通过用户名获取用户详情
     * @param username 用户详情
     * @return UserInfo
     */
    @Override
    public UserInfo findByUsername(String username) {
        return userInfoDao.findByUsername(username);
    }

    /**
     * 添加用户信息
     * @param userInfo 用户信息
     * @return
     */
    @Override
    public String save(UserInfo userInfo){
        userInfoDao.save(userInfo);
        return "添加成功";
    }

    /**
     * 删除用户信息
     * @param userInfo 用户信息
     * @return
     */
    @Override
    public String delete(String username) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(username);
        userInfoDao.delete(userInfo);
        return "删除成功";
    }


}
