package com.wt.controller;

import com.wt.pojo.Blog;
import com.wt.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/blog/{id}")
    public String toBlogPage(@PathVariable("id") Integer id,Model model){
        //通过blogId拿到blog信息
        Blog blog = blogService.getBlogById(id);

        //送到前台
        model.addAttribute("blog",blog);

        return "blog";
    }

    @RequestMapping("/blogList")
    public String toBlogListPage(Model model){
        //拿到blogList
        List<Blog> blogs = blogService.getAllBlogs();

        //送到前台
        model.addAttribute("blogs",blogs);

        return "blogList";
    }

    @GetMapping("/delete/{id}")
    public String deleteABlog(@PathVariable("id") Integer id){
        //根据id删除博客
        blogService.deleteBlogById(id);

        return "redirect:/index";
    }

    @GetMapping("/update/{id}")
    public String toUpdatePage(@PathVariable("id") Integer id,Model model){
        //根据id拿到博客信息
        Blog blog = blogService.getBlogById(id);
        model.addAttribute("blog",blog);

        return "updateBlog";
    }

    @PostMapping("/updateBlog")
    public String updateBlog(Blog blog){
        blogService.updateBlog(blog);

        //更新后跳转到被更新的博客页看效果
        return "redirect:/blog/" + blog.getId();
    }

}
