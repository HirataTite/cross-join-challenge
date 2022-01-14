package com.example.crossjoinchallenge.mapper;

import com.example.crossjoinchallenge.domain.entities.Product;
import com.example.crossjoinchallenge.domain.repositories.ProductRepository;
import com.example.crossjoinchallenge.web.model.ProductResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    private final ProductRepository productRepository;

    public ProductMapper(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductResponse> getProducts(String productName) {
        List<Product> productList = productRepository.findProductByProductName(productName);
        return productList.stream()
                .map(product ->
                        ProductResponse.builder()
                                .productName(product.getProductName())
                                .price(product.getPrice())
                                .build())
                .collect(Collectors.toList());
    }
}
