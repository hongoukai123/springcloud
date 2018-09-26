package com.kai.springcloudchapter5.controller;

import com.kai.springcloudchapter5.entity.UserInfo;
import com.kai.springcloudchapter5.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息控制器（客户端与服务端接口调用控制层）
 * RestController注解表明该类似控制器类，并且包含ResponseBody注解
 * RequestMapping注解设置api访问路由
 * @author hongok
 * @since 2018-9-11 09:59:23
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 根据用户名从数据库获取用户数据
     * GetMapping注解表明该接口方法的请求方式为GET请求，以RESTful风格路径的参数进行访问
     * @param username 用户名
     * @return UserInfo用户详情
     */
    @GetMapping("/{username}")
    public UserInfo getUserInfo(@PathVariable("username")String username){
        return userInfoService.findByUsername(username);
    }

}
