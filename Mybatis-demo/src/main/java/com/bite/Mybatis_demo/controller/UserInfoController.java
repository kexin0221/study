package com.bite.Mybatis_demo.controller;

import com.bite.Mybatis_demo.model.UserInfo;
import com.bite.Mybatis_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserInfoController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getAllUser")
    public List<UserInfo> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("/getUserInfoById")
    public UserInfo getUserInfoById(Integer id) {
        return userService.getUserInfoById(id);
    }
}
