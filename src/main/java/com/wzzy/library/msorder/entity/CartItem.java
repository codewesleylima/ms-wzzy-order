package com.wzzy.library.msorder.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "cart_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItemIdEntity;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private ShoppingCart cartEntity;

    @Column(nullable = false)
    private Long bookIdEntity;

    @Column(nullable = false)
    private Integer quantityEntity;

    @Column(nullable = false)
    private LocalDateTime addedDateEntity = LocalDateTime.now();

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();
}
