package com.web.travel.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "blog")
@Data
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String content1;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String content2;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String content3;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @JsonIgnoreProperties
    @ManyToMany
    @JoinTable(name = "blog_tag",
            joinColumns = @JoinColumn(name = "blog_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tags;


    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL)
    private List<ImgSrc> images;

    @JsonIgnoreProperties
    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    // constructors, getters, setters
}
