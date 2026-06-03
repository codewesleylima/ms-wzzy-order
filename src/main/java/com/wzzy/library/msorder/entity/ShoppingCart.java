package com.wzzy.library.msorder.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "shopping_carts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shoppingCartIdEntity;

    @Column(nullable = false)
    private Long customerIdEntity;

    @Column(nullable = false)
    private LocalDateTime createdDateEntity = LocalDateTime.now();

    private LocalDateTime expiryDateEntity;

    @Column(nullable = false)
    private String statusEntity = "ACTIVE";

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
