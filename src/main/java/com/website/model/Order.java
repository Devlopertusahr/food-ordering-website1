package com.website.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="orders" )
public class Order {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     @ManyToMany
    private User customer;
     @JsonIgnore
     @ManyToOne
     private Restaurant restaurant;

     private Long totalAmount;

private String orderStatus;

private Date createAt;
@ManyToOne
private Address deliveryAddress;

@OneToMany
private List<Orderitem> items;

//private Payment payment;

private int totalItem;

private int totalprice;
}
