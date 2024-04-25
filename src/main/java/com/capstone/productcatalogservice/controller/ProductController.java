package com.capstone.productcatalogservice.controller;

import com.capstone.productcatalogservice.dtos.ProductDto;
import com.capstone.productcatalogservice.models.Product;
import com.capstone.productcatalogservice.services.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List <Product> getAllProducts() {
        return null;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public ProductDto addProduct(@RequestBody ProductDto productDto) {
        return productDto;
    }


}
