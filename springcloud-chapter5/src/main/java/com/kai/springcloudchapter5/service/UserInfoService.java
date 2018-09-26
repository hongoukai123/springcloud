package com.kai.springcloudchapter5.service;

import com.kai.springcloudchapter5.dao.IUserInfoDao;
import com.kai.springcloudchapter5.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息业务类
 * Service注解表明该类属于业务类
 * @author hongok
 * @since
 */
@Service
public class UserInfoService {

    @Autowired
    private IUserInfoDao userInfoDao;

    /**
     * 根据用户名从数据库获取用户数据
     * @param username 用户名
     * @return UserInfo用户详情
     */
    public UserInfo findByUsername(String username){
        return userInfoDao.findByUsername(username);
    }

}
