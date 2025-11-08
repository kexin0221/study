package com.bite.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

//    @RequestMapping("/hello/v1")
    @RequestMapping("/hello")
    public String hello(){
//        int aa = 10/0;
        return "hello, Spring boot~";
    }
}
