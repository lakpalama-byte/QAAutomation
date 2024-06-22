package com.ourairlines.airlines.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Setter
@Getter
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String Name;
    private Long contactNumber;
    private String email;



    public Customer() {
    }

    public Customer(Long id, String name, Long contactNumber, String email) {
        this.id = id;
        Name = name;
        this.contactNumber = contactNumber;
        this.email = email;
    }

}
