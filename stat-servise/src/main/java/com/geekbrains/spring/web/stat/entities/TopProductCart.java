package com.geekbrains.spring.web.stat.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;



    @Entity
    @Table(name = "topproductcart")
    @Data
    @NoArgsConstructor
    public class TopProductCart {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "title")
        private String title;

        @Column(name = "quantity")
        private Integer quantity ;

        @CreationTimestamp
        @Column(name = "created_at")
        private LocalDateTime createdAt;

        @UpdateTimestamp
        @Column(name = "updated_at")
        private LocalDateTime updatedAt;

        public TopProductCart(Long id, String title, Integer quantity ) {
            this.id = id;
            this.title = title;
            this.quantity = quantity;
        }
    }


