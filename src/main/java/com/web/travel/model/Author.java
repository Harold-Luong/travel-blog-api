package com.web.travel.model;

import com.web.travel.model.audit.DateAudit;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Author")
@Data
public class Author extends DateAudit     {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "full_name", length = 255)
    private String fullName;

    @Column(name = "email", unique = true, length = 255)
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

}