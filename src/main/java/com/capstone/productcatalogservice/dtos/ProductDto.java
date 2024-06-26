package com.capstone.productcatalogservice.dtos;

import com.capstone.productcatalogservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String name;
    private String description;
    private String imageUrl;
    private Double price;
    private Category category;
}
