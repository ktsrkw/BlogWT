package com.wt.dao;

import com.wt.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BlogMapper {
    //根据id拿到文章
    Blog getBlogById(int id);
}
