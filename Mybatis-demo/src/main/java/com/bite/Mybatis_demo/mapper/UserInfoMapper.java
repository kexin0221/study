package com.bite.Mybatis_demo.mapper;

import com.bite.Mybatis_demo.model.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    //=======================参数传递==========================

//    @Select("SELECT id, username, password, age, gender, phone, delete_flag as deleteFlag, " +
//            "create_time as createTime, update_time as updateTime FROM `user_info`")
//    @Results({
//            @Result(column = "delete_flag", property = "deleteFlag"),
//            @Result(column = "create_time", property = "createTime"),
//            @Result(column = "update_time", property = "updateTime")
//    })
    @Select("SELECT * FROM user_info")
    List<UserInfo> selectALL();

    @Select("SELECT * FROM user_info")
    UserInfo selectALL2();

    @Select("SELECT * from user_info where id = #{id}")
    UserInfo selectAllById(Integer id);

    @Select("SELECT * from user_info where id = #{id}")
    List<UserInfo> selectAllById2(Integer id);

    @Select("SELECT * from user_info where id = ${id}")
    List<UserInfo> selectAllById3(Integer id);

    @Select("SELECT * from user_info where username = #{aa} AND password = #{bb}")
    List<UserInfo> selectAllByNameandPwd(@Param("aa") String username, @Param("bb") String password);

    @Select("SELECT * from user_info where username = '${aa}' AND password = '${bb}'")
    List<UserInfo> selectAllByNameandPwd2(@Param("aa") String username, @Param("bb") String password);

    //==========================增============================

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO user_info (username, `password`, age) VALUES (#{username}, #{password}, #{age})")
    Integer insertUser(UserInfo userInfo);   // 返回结果为影响行数

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO user_info (username, `password`, age) " +
            "VALUES (#{userInfo.username}, #{userInfo.password}, #{userInfo.age})")
    Integer insertUser2(@Param("userInfo") UserInfo userInfo);

    //==========================删============================

    @Delete("delete from user_info where id = #{id}")
    Integer deleteUser(Integer id);

    //==========================改============================

    @Update("update user_info set delete_flag = #{deleteFlag}, phone = #{phone} where id = #{id}")
    Integer updateUser(UserInfo userInfo);

    //==========================排序===========================

    @Select("select * from user_info order by id ${order}")
    List<UserInfo> selectUserInfoByOrder(String order);

    //========================模糊查询==========================

    @Select("SELECT * FROM `user_info` WHERE username LIKE CONCAT('%',#{userName},'%')")
    List<UserInfo> selectUserInfoByLike(String userName);

    //========================动态SQL==========================

    @Insert("<script>" +
            "INSERT INTO user_info " +
            "<trim prefixOverrides=\",\" suffixOverrides=\",\" prefix=\"(\" suffix=\")\"> " +
            "<if test=\"username!=null\"> username, </if> " +
            "<if test=\"password!=null\"> password, </if> " +
            "<if test=\"age!=null\"> age, </if> " +
            "<if test=\"gender!=null\"> gender, </if> " +
            "<if test=\"phone!=null\"> phone, </if> " +
            "</trim> VALUES <trim prefixOverrides=\",\" suffixOverrides=\",\" prefix=\"(\" suffix=\")\"> " +
            "<if test=\"username!=null\"> #{username}, </if> " +
            "<if test=\"password!=null\"> #{password}, </if> " +
            "<if test=\"age!=null\"> #{age}, </if> " +
            "<if test=\"gender!=null\"> #{gender}, </if> " +
            "<if test=\"phone!=null\"> #{phone}, </if> </trim>" +
            "</script>")
    Integer insertUser3(UserInfo userInfo);
}
