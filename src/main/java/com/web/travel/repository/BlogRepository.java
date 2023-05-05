package com.web.travel.repository;

import com.web.travel.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
    List<Blog> findBlogByTag(Long id);
    List<Blog> findBlogByLocation(Long id);
}
