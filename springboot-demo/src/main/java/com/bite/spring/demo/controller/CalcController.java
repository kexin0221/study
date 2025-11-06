package com.bite.spring.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calc")
//@RestController 表示返回数据  @Controller 表示返回视图
@RestController
public class CalcController {

    @RequestMapping("/sum")
    public String sum(Integer num1, Integer num2){
        if (num1 == null || num2 == null){
            return "参数不合法, 请检查后再提交";
        }
        Integer sum = num1 + num2;

        return "<h1>计算机计算结果: " + sum + "</h1>";
    }
}
