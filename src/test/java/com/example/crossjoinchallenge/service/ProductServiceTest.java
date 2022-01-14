package com.example.crossjoinchallenge.service;

import com.example.crossjoinchallenge.domain.repositories.ProductRepository;
import com.example.crossjoinchallenge.mapper.ProductMapper;
import com.example.crossjoinchallenge.web.model.ProductResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Transactional
@Commit
@Import({ProductService.class, ProductMapper.class})
@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductMapper productMapper;

    @Mock
    private ProductRepository productRepository;

    @Test
    void getProducts() {
//        when(productMapper.getProducts("test"))
//                .thenReturn(ProductResponse.builder()
//                        .productName("test")
//                        .price()
//                        .build());
        List<ProductResponse> productResponse = productService.getProducts("product1");
        assertThat(productResponse).isNotNull();
        assertThat(productResponse.size()).isEqualTo(0);
    }

}
