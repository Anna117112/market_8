package com.geekbrains.spring.web.cart.integrations;

import com.geekbrains.spring.web.api.core.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;


@Component
@RequiredArgsConstructor
public class StatisticServiceIntegration {
    private final RestTemplate restTemplate;

    @Value("${integrations.stat-service.url}")
    private String statServiseUrl;

    public void stat(Long id) {
        ProductDto productDto = restTemplate.getForObject(statServiseUrl + "/api/v1/statistic/top/" +id, ProductDto.class);

    }
}
