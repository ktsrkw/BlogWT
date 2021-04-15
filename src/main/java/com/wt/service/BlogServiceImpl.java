package com.wt.service;

import com.wt.dao.BlogMapper;
import com.wt.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogMapper blogMapper;

    @Override
    public Blog getBlogById(int id) {
        return blogMapper.getBlogById(id);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogMapper.getAllBlogs();
    }

    @Override
    public int deleteBlogById(int id) {
        return blogMapper.deleteBlogById(id);
    }

    @Override
    public int updateBlog(Blog blog) {
        return blogMapper.updateBlog(blog);
    }
}
