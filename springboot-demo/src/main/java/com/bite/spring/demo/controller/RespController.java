package com.bite.spring.demo.controller;

import com.bite.spring.demo.model.UserInfo;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/resp")
//@RestController
@Controller
public class RespController {
    /**
     * 返回页面
     * @return
     */
    @RequestMapping("/r1")
    public String returnPage(){
        return "/aa/index.html";
    }

    /**
     * 返回数据
     * @return
     */
    @ResponseBody
    @RequestMapping("/r2")
    public String returnData(){
        return "我是前端需要的数据";
    }

    @ResponseBody
    @RequestMapping("/r3")
    public String returnHTML(){
        return "<h1>我是一级标题</h1>";
    }
    @ResponseBody
    @RequestMapping(value = "/r4", produces = "text/plain")
    public String returnText(){
        return "<h1>我是一级标题</h1>";
    }

    @ResponseBody
    @RequestMapping(value = "/r5")
    public UserInfo returnJson(){
        UserInfo userInfo = new UserInfo("zhangsan",1,1 );
        return userInfo;
    }

    @ResponseBody
    @RequestMapping(value = "/r6")
    public UserInfo setStatus(HttpServletResponse response){
        response.setStatus(404);
        UserInfo userInfo = new UserInfo("zhangsan",1,1 );
        return userInfo;
    }


    @ResponseBody
    @RequestMapping(value = "/r7")
    public String setHeader(HttpServletResponse response){
        response.setHeader("myHeader", "myHeader");
        return "设置Header成功";
    }


}
