package com.bite.spring.demo.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/user2")
@RestController
public class UserController2 {

    //既支持get, 又支持post
    @RequestMapping("/m1")
    public String m1(){
        //com.bite.spring.demo.UserController#m1()
        return "m1";
    }
    //只支持get
    @RequestMapping(value = "/m2",method = RequestMethod.GET)
    public String m2(){
        return "m2";
    }

    //只支持post
//    @RequestMapping(value = "/m3",method = {RequestMethod.GET, RequestMethod.POST})
    @RequestMapping(value = "/m3",method =  RequestMethod.POST)
    public String m3(){
        return "m3";
    }

    //只支持get
    @GetMapping("/m4")
    public String m4(){
        return "m4";
    }
    //只支持post
    @PostMapping("/m4")
    public String m5(){
        return "m5";
    }


}
