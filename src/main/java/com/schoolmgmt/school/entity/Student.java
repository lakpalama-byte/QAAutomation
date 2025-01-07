package com.schoolmgmt.school.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String Name;
    private Long contactNumber;
    private String email;



    public Student() {
    }

    public Student(Long id, String name, Long contactNumber, String email) {
        this.id = id;
        Name = name;
        this.contactNumber = contactNumber;
        this.email = email;
    }

}
