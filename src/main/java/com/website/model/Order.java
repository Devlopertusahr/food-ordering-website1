package com.website.model;


import jakarta.persistence.*;
import org.apache.catalina.User;

@Entity
public class Order {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     @ManyToMany
     private User customer;

}
