package com.website.model;




import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.cache.spi.entry.StructuredCacheEntry;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@OneToOne
    private User Customer;

private Long total;
@OneToMany(mappedBy = "cart" ,cascade = CascadeType.ALL,orphanRemoval = true)
private List<CarItem> item = new ArrayList<>();

}
