package com.bite.springiocdemo.controller;

import com.bite.springiocdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    //属性注入
//    @Autowired
//    private UserService userService;

    //构造方法注入
    private final UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }

    public void print() {
        System.out.println("Hello control");
        System.out.println(userService);
        userService.print();
    }
}
