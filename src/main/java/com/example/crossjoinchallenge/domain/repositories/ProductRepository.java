package com.example.crossjoinchallenge.domain.repositories;

import com.example.crossjoinchallenge.domain.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    List<Product> findProductByProductName(String productName);
}
