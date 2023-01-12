//package com.geekbrains.spring.web.stat.convector;
//
//import com.geekbrains.spring.web.api.core.ProductDto;
//
//import com.geekbrains.spring.web.stat.dto.ProductStaticDto;
//import com.geekbrains.spring.web.stat.entities.TopProductCart;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class ProductStatisticConverter {
//    public TopProductCart dtoToEntity(ProductStaticDto productStaticDto) {
//        return new TopProductCart(productStaticDto.getId(), productStaticDto.getTitle(), productStaticDto.getQuantity());
//    }
//
//    public ProductStaticDto entityToDto(TopProductCart topProductCart) {
//        return new ProductStaticDto(topProductCart.getId(), topProductCart.getTitle(), topProductCart.getQuantity());
//    }
//}
