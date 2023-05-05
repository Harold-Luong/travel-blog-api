package com.web.travel.model;
import lombok.Data;

import javax.persistence.*;

import java.util.List;


@Entity
@Data
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs;

    // constructors, getters, setters
}
