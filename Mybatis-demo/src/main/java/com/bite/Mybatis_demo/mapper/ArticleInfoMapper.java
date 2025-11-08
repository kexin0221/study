package com.bite.Mybatis_demo.mapper;

import com.bite.Mybatis_demo.model.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleInfoMapper {

    ArticleInfo selectArticleInfoById(Integer id);
}
