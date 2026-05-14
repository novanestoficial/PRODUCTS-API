package com.devidnest.products_api;

import com.devidnest.products_api.controller.ProductController;
import com.devidnest.products_api.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductsApiApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(ProductsApiApplication.class, args);

        ProductController p = context.getBean(ProductController.class);

        Product lancer = new Product(
                null,
                "Lancer",
                "Lancer Evo 600cv",
                80000.0
        );

        Product bmw = new Product(
                null,
                "BMW",
                "BMW M4 1200cv",
                1400000.0
        );

        Product mustang = new Product(
                null,
                "Mustang",
                "Mustang GT 700cv",
                500000.0
        );

        Product mercedes = new Product(
                null,
                "Mercedes",
                "Mercedes AMG 550cv",
                250000.0
        );

        Product audi = new Product(
                null,
                "Audi",
                "Audi RS7 1300cv",
                3000000.0
        );

        Product ferrari = new Product(
                null,
                "Ferrari",
                "Ferrari 488 Pista 1820cv",
                8000000.0
        );

        p.saveProducts(
                java.util.List.of(lancer, bmw, mustang, mercedes, audi, ferrari)
        );
    }
}