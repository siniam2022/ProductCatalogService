package com.capstone.productcatalogservice.controller;

import com.capstone.productcatalogservice.dtos.ProductDto;
import com.capstone.productcatalogservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public List <Product> getAllProducts() {
        return null;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("iPhone");
        product.setPrice(1000000D);
        return product;
    }

    @PostMapping
    public ProductDto addProduct(@RequestBody ProductDto productDto) {
        return productDto;
    }

}
