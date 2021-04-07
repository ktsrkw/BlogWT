package com.wt.service;

import com.wt.dao.BlogMapper;
import com.wt.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogMapper blogMapper;

    @Override
    public Blog getBlogById(int id) {
        return blogMapper.getBlogById(id);
    }
}
