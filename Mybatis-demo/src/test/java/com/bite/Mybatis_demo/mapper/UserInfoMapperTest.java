package com.bite.Mybatis_demo.mapper;

import com.bite.Mybatis_demo.model.UserInfo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class UserInfoMapperTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    void selectALL() {
        List<UserInfo> users = userInfoMapper.selectALL();
        System.out.println(users);
    }

    @BeforeEach
    void setUp() {
        System.out.println("before...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after...");
    }

    @Test
    void selectAllById() {
        System.out.println(userInfoMapper.selectAllById(1));
    }

    @Test
    void selectAllById2() {
        System.out.println(userInfoMapper.selectAllById2(2));
    }

    //    @Test
//    void selectALL2() {
//        System.out.println(userInfoMapper.selectALL2());
//    }

    @Test
    void selectAllByNameandPwd() {
        System.out.println(userInfoMapper.selectAllByNameandPwd("zhangsan",
                "zhangsan"));
    }

    @Test
    void insertUser() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("username3");
        userInfo.setPassword("password3");
        userInfo.setAge(3);
        System.out.println("影响行数:" + userInfoMapper.insertUser(userInfo) +
                ", id:" + userInfo.getId());
    }

    @Test
    void insertUser2() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("username4");
        userInfo.setPassword("password4");
        userInfo.setAge(4);
        System.out.println("影响行数:" + userInfoMapper.insertUser2(userInfo) +
                ", id:" + userInfo.getId());
    }

    @Test
    void deleteUser() {
        userInfoMapper.deleteUser(10);
    }

    @Test
    void updateUser() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(8);
        userInfo.setDeleteFlag(1);
        userInfo.setPhone("13415373812");
        userInfoMapper.updateUser(userInfo);
    }

    @Test
    void selectAllById3() {
        System.out.println(userInfoMapper.selectAllById3(1));
    }

    @Test
    void selectAllByNameandPwd2() {
        System.out.println(userInfoMapper.selectAllByNameandPwd2("zhangsan",
                "zhangsan"));
    }

    @Test
    void selectUserInfoByOrder() {
        userInfoMapper.selectUserInfoByOrder("desc").forEach(System.out::println);
    }

    @Test
    void selectUserInfoByLike() {
        userInfoMapper.selectUserInfoByLike("username").forEach(System.out::println);
    }

    @Test
    void insertUser3() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("username11");
        userInfo.setPassword("password11");
        userInfo.setAge(11);
        userInfoMapper.insertUser3(userInfo);
    }
}