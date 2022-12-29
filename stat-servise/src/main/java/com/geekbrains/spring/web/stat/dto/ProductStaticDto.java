package com.geekbrains.spring.web.stat.dto;

public class ProductStaticDto {
    private Long id;
    private String title;
    private Integer quantity;


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public ProductStaticDto() {
    }

    public ProductStaticDto(Long id, String title, Integer price) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }
}



