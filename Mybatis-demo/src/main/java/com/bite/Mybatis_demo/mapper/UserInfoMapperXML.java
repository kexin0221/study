package com.bite.Mybatis_demo.mapper;

import com.bite.Mybatis_demo.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInfoMapperXML {

    List<UserInfo> selectAll();

    List<UserInfo> selectAll2();

    Integer insertUser(UserInfo userInfo);

    Integer insertUser2(@Param("userinfo") UserInfo userInfo);

    Integer insertUser3(UserInfo userInfo);

    Integer updateUser(String password, Integer age, Integer id);

    Integer deleteUser(Integer id);

    List<UserInfo> selectByCondition(UserInfo userInfo);

    Integer updateByCondition(UserInfo userInfo);

    Integer batchDelete(List<Integer> ids);
}
