package com.web.travel.controller;

import com.web.travel.model.Blog;
import com.web.travel.service.BlogService;
import com.web.travel.service.BlogServiceIml;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BlogController {
     @Autowired
     BlogService blogService;


//    @GetMapping("/")
//    List<Blog> index(){
//        return  blogService.getAllBlogs();
//    }

    @GetMapping("/i")
    String tes(){
        return  "blogService.getAllBlogs()";
    }
}
