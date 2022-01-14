package com.example.crossjoinchallenge.web.controller;

import com.example.crossjoinchallenge.service.ProductService;
import com.example.crossjoinchallenge.web.model.ProductResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/challenge/products/{productName}")
    private List<ProductResponse> getConvertedRate(@PathVariable @NotNull String productName) {
        return productService.getProducts(productName);
    }

}
