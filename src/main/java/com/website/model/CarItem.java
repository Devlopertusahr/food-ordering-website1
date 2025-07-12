package com.website.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarItem {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
@ManyToOne
@JsonIgnore
private Cart cart;
@ManyToOne
private Food food;
private int quality;
private List<String> ingredients;

private Long totalPrice;
}
