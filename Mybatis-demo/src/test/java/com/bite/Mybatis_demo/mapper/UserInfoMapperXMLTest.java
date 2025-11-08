package com.bite.Mybatis_demo.mapper;

import com.bite.Mybatis_demo.model.UserInfo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserInfoMapperXMLTest {

    @Autowired
    private UserInfoMapperXML userInfoMapperXML;

    @BeforeEach
    void setUp() {
        System.out.println("BEFORE...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AFTER...");
    }

    @Test
    void selectAll() {
        userInfoMapperXML.selectAll().forEach(System.out::println);
    }

    @Test
    void selectAll2() {
        userInfoMapperXML.selectAll2().forEach(System.out::println);
    }

    @Test
    void insertUser() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("username4");
        userInfo.setPassword("password4");
        userInfo.setAge(4);
        userInfoMapperXML.insertUser(userInfo);
    }

    @Test
    void insertUser2() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("username5");
        userInfo.setPassword("password5");
        userInfo.setAge(5);
        System.out.println("影响行数:" + userInfoMapperXML.insertUser2(userInfo) +
                ", 自增id:" + userInfo.getId());
    }

    @Test
    void updateUser() {
        userInfoMapperXML.updateUser("updatePassword5", 6, 13);
    }

    @Test
    void deleteUser() {
        userInfoMapperXML.deleteUser(12);
    }

    @Test
    void insertUser3() {
        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername("username7");
        userInfo.setPassword("username10");
        userInfo.setAge(10);
        userInfo.setGender(10);
//        userInfo.setPhone("1006");
        userInfoMapperXML.insertUser3(userInfo);
    }

    @Test
    void selectByCondition() {
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(6);
        userInfo.setGender(0);
        userInfoMapperXML.selectByCondition(userInfo).forEach(System.out::println);
    }

    @Test
    void updateByCondition() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(23);
//        userInfo.setPassword("password5");
        userInfo.setAge(0);
//        userInfo.setGender(1);
        userInfoMapperXML.updateByCondition(userInfo);
    }

    @Test
    void batchDelete() {
        List<Integer> ids = new ArrayList<>();
        ids.add(21);
        ids.add(22);
        ids.add(23);
        userInfoMapperXML.batchDelete(ids);
    }
}