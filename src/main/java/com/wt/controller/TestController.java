package com.wt.controller;

import com.wt.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    @Qualifier("blogServiceImpl")
    BlogService blogService;

    @RequestMapping("/blog/1")
    public String evTest(){
        return blogService.getBlogById(1).toString();
    }

}
