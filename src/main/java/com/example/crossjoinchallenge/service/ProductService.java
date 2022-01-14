package com.example.crossjoinchallenge.service;

import com.example.crossjoinchallenge.mapper.ProductMapper;
import com.example.crossjoinchallenge.web.model.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductMapper productMapper;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public List<ProductResponse> getProducts(String productName) {
        return productMapper.getProducts(productName);
    }
}
