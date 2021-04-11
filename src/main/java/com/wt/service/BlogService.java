package com.wt.service;


import com.wt.pojo.Blog;

import java.util.List;

public interface BlogService {
    //根据id拿到文章
    Blog getBlogById(int id);

    //拿到所有博客列表
    List<Blog> getAllBlogs();
}
