package com.wt.service;


import com.wt.pojo.Blog;

public interface BlogService {
    //根据id拿到文章
    Blog getBlogById(int id);
}
