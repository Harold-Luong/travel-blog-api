package com.web.travel.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location")
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Blog> blogs;

    // constructors, getters, setters
}
