package com.kai.springcloudchapter7.controller;

import com.kai.springcloudchapter7.entity.UserInfo;
import com.kai.springcloudchapter7.service.IUserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息控制器
 * @author hongok
 * @since 2018年9月13日 16:12:10
 */
@RestController
@RequestMapping("/users")
@Api("用户信息相关接口")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @ApiOperation(value = "创建/或修改用户", notes = "根据UserInfo对象创建/或修改")
    @ApiImplicitParam(name = "userInfo", value = "用户详细实体userInfo", required = true, dataType = "UserInfo")
    @PostMapping("/save")
    public String save(@RequestBody UserInfo userInfo){
        return userInfoService.save(userInfo);
    }

    @ApiOperation(value = "获取用户详情", notes = "根据用户名获取用户详情")
    @GetMapping("/find/{username}")
    public UserInfo findUserObj(@PathVariable String username){
        return userInfoService.findByUsername(username);
    }

    @ApiOperation(value = "删除用户信息", notes = "根据id删除用户信息")
    @GetMapping("/delete/{username}")
    public String delete(@PathVariable String username){
        return userInfoService.delete(username);
    }

}
