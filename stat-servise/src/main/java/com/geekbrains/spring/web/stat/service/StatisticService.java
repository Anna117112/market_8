package com.geekbrains.spring.web.stat.service;



import com.geekbrains.spring.web.stat.entities.TopProductCart;
import com.geekbrains.spring.web.stat.integrations.ProductsServiceIntegration;
import com.geekbrains.spring.web.stat.repositories.TopProductCartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StatisticService {
    private final TopProductCartRepository topProductCartRepository;
    private final ProductsServiceIntegration productsServiceIntegration;
    // список продуктов по id Optional - пишется если может быть ошибка что продуст не судествует

    public Optional<TopProductCart> findById(Long id) {
        return topProductCartRepository.findById(id);
    }



    public TopProductCart save(TopProductCart topProductCart) {
//        ProductDto productDto = productsServiceIntegration.findById();
//        TopProductCart topProductCart = new TopProductCart();
//        topProductCart.setTitle(productDto.getTitle());
//        topProductCart.setQuantity(topProductCart.getQuantity()+1);
        // преверяем есть ли он в базе если нет то создаем нового
        // topProductCart = topProductCartRepository.findByTitle(topProductCart.getTitle()).orElse(topProductCartRepository.save(topProductCart));
        // возвращаем dto
        return topProductCartRepository.save(topProductCart);
    }

    public List<TopProductCart> findTop() {
        System.out.println(topProductCartRepository.findTopCart());
        return topProductCartRepository.findTopCart();
    }

    public List<TopProductCart> findAll() {
        //System.out.println(topProductCartRepository.findTopCart());
        return topProductCartRepository.findAll();
    }

    public TopProductCart findByName(String title) {

        return topProductCartRepository.findByName(title);
    }

    @Transactional
    public TopProductCart update(String title) {

        TopProductCart topProductCart = topProductCartRepository.findByName(title);
        topProductCart.setQuantity(topProductCart.getQuantity() + 1);
        return topProductCart;
    }
}