package com.capstone.productcatalogservice.services;

import com.capstone.productcatalogservice.dtos.ProductDto;
import com.capstone.productcatalogservice.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProducts();

    Product getProductById(Long id);

    ProductDto addProduct(ProductDto productDto);
}
