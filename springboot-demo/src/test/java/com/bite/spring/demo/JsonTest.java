package com.bite.spring.demo;

import com.bite.spring.demo.model.UserInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class JsonTest {

    @Test
    void testObject2Json() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        //创建Java对象
//        UserInfo userInfo = new UserInfo("zhangsan", 15, 1);
//        //对象转json
//        String s = objectMapper.writeValueAsString(userInfo);
//        System.out.println(s);
    }

    @Test
    void testJson2Object() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        //定义一个json字符串
        String s = "{\"name\":\"zhangsan\",\"gender\":1,\"age\":15}";
        //json 转 对象
        UserInfo userInfo = objectMapper.readValue(s, UserInfo.class);
        System.out.println(userInfo);
    }



}
