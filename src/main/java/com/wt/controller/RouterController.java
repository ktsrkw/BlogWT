package com.wt.controller;

import com.wt.pojo.Blog;
import com.wt.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RouterController {
    @Autowired
    @Qualifier("blogServiceImpl")
    BlogService blogService;

    @RequestMapping({"/index","/"})
    public String toIndex(Model model){
        List<Blog> blogs = blogService.getAllBlogs();
        model.addAttribute("blogs",blogs);

        return "index";
    }


}
