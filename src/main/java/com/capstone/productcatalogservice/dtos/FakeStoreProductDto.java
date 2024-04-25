package com.capstone.productcatalogservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String Title;
    private String Description;
    private String Category;
    private Double price;
    private String image;
    private FakeStoreRatingDto rating;
}
