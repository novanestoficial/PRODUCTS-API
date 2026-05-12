package com.devidnest.products_api.controller;


import com.devidnest.products_api.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    @PostMapping
    public void saveProduct(Product product) {
        System.out.println("Saving product: " + product);
    }
}
