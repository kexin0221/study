package com.bite.Mybatis_demo.service;

import com.bite.Mybatis_demo.mapper.UserInfoMapper;
import com.bite.Mybatis_demo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    public List<UserInfo> getAllUser() {
        return userInfoMapper.selectALL();
    }

    public UserInfo getUserInfoById(Integer id) {
        return userInfoMapper.selectAllById(id);
    }
}
