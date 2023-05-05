package com.web.travel.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "img_src")
public class ImgSrc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String thumbnail;

    @Column(nullable = false)
    private String source;

    @ManyToOne
    @JoinColumn(name = "blog_id", nullable = false)
    private Blog blog;

    // constructors, getters, setters
}
