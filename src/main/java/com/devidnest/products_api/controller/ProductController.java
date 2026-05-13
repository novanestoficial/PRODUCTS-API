package com.devidnest.products_api.controller;


import com.devidnest.products_api.model.Product;
import com.devidnest.products_api.repositorie.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public void saveProduct(@RequestBody Product product) {
        System.out.println("Saving product: " + product);
        productRepository.save(product);
    }
}
