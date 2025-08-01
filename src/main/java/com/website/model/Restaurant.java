package com.website.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private User Owner;

    private String name;

    private String description;
  private  String cuisineType;

  @OneToOne
  private Address address;

  @Embedded
  private ContactInformation contactInformation;

  private String openingHours;
@OneToMany(mappedBy = "restaurant" , cascade = CascadeType.ALL , orphanRemoval = true)
  private List<Order> order = new ArrayList<>();

@ElementCollection
@Column(length =1000)
private List<String> images;

private LocalDateTime registrationData;

private boolean open;

@JsonIgnore
@OneToMany(mappedBy = "restaurant" , cascade = CascadeType.ALL)
private List<Food> food = new ArrayList<>();



}
