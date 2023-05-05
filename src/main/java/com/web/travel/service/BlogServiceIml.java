package com.web.travel.service;

import com.web.travel.model.Blog;
import com.web.travel.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceIml implements BlogService {
    @Autowired
    private BlogRepository blogRepository;


    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public List<Blog> getAllBlogByTag(Long id) {
        return null;
    }

    @Override
    public List<Blog> getAllBlogByLocation(Long id) {
        return null;
    }
}
