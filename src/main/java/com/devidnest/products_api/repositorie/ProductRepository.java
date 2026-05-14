package com.devidnest.products_api.repositorie;

import com.devidnest.products_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


    List<Product> findByName(String name);
}
