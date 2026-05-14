package com.devidnest.products_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Override
    public String toString() {
        return "Product: \n"
                + "ID: " + id + "\n"
                + "NAME: " + name + "\n"
                + "DESCRIPTION: " + description + "\n"
                + "PRICE: " + price + "\n";
    }

}