package com.devidnest.products_api.repositorie;

import com.devidnest.products_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
