package com.bite.springiocdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/prop")
@Controller
@ResponseBody
public class PropertiseController {
    @Value("${my.key}")
    private Integer myKey;

    @Value("${my.key2}")
    private Boolean myKey2;

    @RequestMapping("/read")
    public String readValue() {
        return "读取配置文件my.key:" + myKey;
    }

    @javax.annotation.PostConstruct
    public void init() {
        System.out.println("myKey: " + myKey);
        System.out.println("myKey2: " + myKey2);
    }
}
