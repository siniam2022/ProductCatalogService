package com.capstone.productcatalogservice.services;

import com.capstone.productcatalogservice.dtos.FakeStoreProductDto;
import com.capstone.productcatalogservice.dtos.ProductDto;
import com.capstone.productcatalogservice.models.Category;
import com.capstone.productcatalogservice.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService implements IProductService {

    private final RestTemplateBuilder restTemplateBuilder;

    public ProductService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;

    }


    @Override
    public List<Product> getProducts() {return null;}


    @Override
    public Product getProductById(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForEntity("https://fakestoreapi.com/products/{id}", FakeStoreProductDto.class, id).getBody();
        assert fakeStoreProductDto != null;
        return getProduct(fakeStoreProductDto);
    }


    @Override
    public ProductDto addProduct(ProductDto productDto) {return null;}

    private Product getProduct(FakeStoreProductDto fakeStoreProductDto){
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setName(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImageUrl(fakeStoreProductDto.getImage());
        Category category = new Category();
        category.setName(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        return product;
    }

}
