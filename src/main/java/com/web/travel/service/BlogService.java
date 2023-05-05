package com.web.travel.service;

import com.web.travel.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BlogService {
    List<Blog> getAllBlogs();
    List<Blog> getAllBlogByTag(Long id);
    List<Blog> getAllBlogByLocation(Long id);

}
