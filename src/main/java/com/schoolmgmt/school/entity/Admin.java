package com.schoolmgmt.school.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.naming.Name;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name="ADMIN")
public class Admin {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
 private Long id;
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique=true, nullable=false)
    private String username;
    private String password;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String status;
    private LocalDateTime lastLogin;




}
