package com.bite.spring.demo.controller;

import com.bite.spring.demo.model.UserInfo;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/request")
//@RestController
@Controller
@ResponseBody
public class RequestController {
    @RequestMapping("/r1")
    public String r1(String keyword){
         return "接收参数: "+keyword;
    }

    @RequestMapping("/r2")
    public String r2(String userName, String password){
        return "接收参数: userName:"+userName +", password:"+password;
    }

    @RequestMapping("/r3")
    public String r3(Integer number){
        return "接收参数: "+number;
    }

    @RequestMapping("/r4")
    public String r4(int number){
        return "接收参数: "+number;
    }

    @RequestMapping("/r5")
    public String r5(UserInfo userInfo){
        return "接收参数: userInfo="+userInfo.toString();
    }

    //从前端接收参数q, 赋值给keyword
    @RequestMapping("/r6")
    public String r6(@RequestParam(value = "q", required = false) String keyword){
        return "接收参数: keyword="+keyword;
    }

    //传递数组
    @RequestMapping("/r7")
    public String r7(String[] arr){
        return "接收参数: arr="+ Arrays.toString(arr);
    }

    //传递集合
    @RequestMapping("/r8")
    public String r8(@RequestParam List<Integer> list){
        return "接收参数: list="+ list;
    }

    //传递json
    @RequestMapping("/r9")
    public String r9(@RequestBody UserInfo userInfo){
//        System.out.println(userInfo.getName());
        return userInfo.toString();
    }
    //从url中获取参数
//    @RequestMapping("/article/{articleId}")
//    public String r10(@PathVariable Integer articleId){
//        return "获取文章ID:"+ articleId;
//    }

    @RequestMapping("/article/{type}/{articleId}")
    public String r11(@PathVariable Integer articleId, @PathVariable("type") Integer articeleType){
        return "获取文章ID:"+ articleId +", type: "+ articeleType;
    }

    //上传文件
    @RequestMapping("/r12")
    public String r12(@RequestPart("file11") MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        //文件上传
        file.transferTo(new File("D:\\temp\\"+ file.getOriginalFilename()));
        return "文件上传成功";
    }

    @RequestMapping("/r13")
    public String r13(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (cookies!=null){
            for (Cookie cookie: cookies){
                System.out.println(cookie.getName()+":"+cookie.getValue());
            }
        }
        return "返回Cookie成功";
    }

    @RequestMapping("/r14")
    public String r14(@CookieValue("java") String java){
        return "从Cookie中获取Java的值: "+ java;
    }

    //存储session
    @RequestMapping("/setSession")
    public String setSession(HttpServletRequest request){
        //从cookie中获取sessionId, 根据sessionId 获取Session对象
        //如果sessionId不存在, 则创建
        HttpSession session = request.getSession();
        //默认存储在内存中
        //登录的用户名称
        session.setAttribute("userName", "zhangsan");
        session.setAttribute("age", 17);
        return "设置session成功";

    }
    //获取session
    @RequestMapping("/getSession")
    public String getSession(HttpServletRequest request){
        //从cookie中获取sessionId, 根据sessionId 获取Session对象
        HttpSession session = request.getSession(false);
        //如果用户登录, session 有值, 未登录, session为null
        if (session==null){
            return "用户未登录";
        }else {
            //从session中获取登录用户的信息
            String userName = (String)session.getAttribute("userName");
            return "登录用户为: " + userName;
        }
    }
    //获取session
    @RequestMapping("/getSession2")
    public String getSession2(HttpSession session){
        //从session中获取登录用户的信息
        String userName = (String)session.getAttribute("userName");
        return "登录用户为: " + userName;

    }

    //获取session
    @RequestMapping("/getSession3")
    public String getSession3(@SessionAttribute("userName") String userName){
        return "登录用户为: " + userName;
    }

    @RequestMapping("/getHeader")
    public String getHeader(HttpServletRequest request){
        String userAgent = request.getHeader("User-Agent");
        return "从header中获取userAgent:"+ userAgent;
    }

    @RequestMapping("/getHeader2")
    public String getHeader2(@RequestHeader("User-Agent") String userAgent){
        return "从header中获取userAgent:"+ userAgent;
    }
}
