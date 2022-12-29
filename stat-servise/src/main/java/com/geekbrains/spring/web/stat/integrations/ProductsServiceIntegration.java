package com.geekbrains.spring.web.stat.integrations;

import com.geekbrains.spring.web.api.core.ProductDto;
import com.geekbrains.spring.web.stat.entities.TopProductCart;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.persistence.Table;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductsServiceIntegration {
    private final RestTemplate restTemplate;

    @Value("${integrations.core-service.url}")
    private String productServiceUrl;

    public ProductDto findById(Long id) {
        ProductDto productDto = restTemplate.getForObject(productServiceUrl + "/api/v1/products/" + id, ProductDto.class);
        return productDto;
    }
}
