package com.wt.dao;

import com.wt.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogMapper {
    //根据id拿到文章
    Blog getBlogById(int id);

    //拿到所有博客列表
    List<Blog> getAllBlogs();

    //根据id删除博客
    int deleteBlogById(int id);

    //修改博客的信息
    int updateBlog(Blog blog);
}
