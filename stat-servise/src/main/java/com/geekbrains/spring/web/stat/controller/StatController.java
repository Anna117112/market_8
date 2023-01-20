package com.geekbrains.spring.web.stat.controller;

import com.geekbrains.spring.web.api.core.ProductDto;
import com.geekbrains.spring.web.stat.convector.ProductStatisticConverter;
import com.geekbrains.spring.web.stat.entities.TopProductCart;
import com.geekbrains.spring.web.stat.integrations.ProductsServiceIntegration;
import com.geekbrains.spring.web.stat.service.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/statistic")
@RequiredArgsConstructor
public class StatController {
    private final StatisticService statisticService;
    private final ProductStatisticConverter productStatisticConverter;
    private final ProductsServiceIntegration productsServiceIntegration;



    //    public String homePage() {
//        return "home";
//    }
    //есл продукт по id найден возвращаем его,  если нет то кидаем инфо об ошибке пакуем в dto
@GetMapping
    public List<TopProductCart> topProductCarts () {

        return statisticService.findTop();
    }

    @GetMapping ("/top/{productId}")
    public ProductDto saveNewProductStatisticDto(@PathVariable Long productId ) {
        ProductDto productDto = productsServiceIntegration.findById(productId);


       // topProductCart.setQuantity(+1);
        //topProductCart = statisticService.findByName(topProductCart.getTitle()).orElse (statisticService.save(topProductCart));
        TopProductCart topProductCart = statisticService.findByName(productDto.getTitle());
        if (topProductCart != null){
            statisticService.update(productDto.getTitle());
            return productDto;
        }
        else {
           topProductCart = new TopProductCart();
            topProductCart.setTitle(productDto.getTitle());
            topProductCart.setQuantity(+1);
            // создаем нового user и передаем ему параметры нового созданного dto
            statisticService.save(topProductCart);
        }
        return productDto;
    }

}