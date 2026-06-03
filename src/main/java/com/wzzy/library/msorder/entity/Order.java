package com.wzzy.library.msorder.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderIdEntity;

    @Column(nullable = false)
    private Long customerIdEntity;

    @Column(nullable = false)
    private LocalDateTime orderDateEntity = LocalDateTime.now();

    @Column(nullable = false)
    private BigDecimal totalPriceEntity;

    @Column(nullable = false)
    private String statusEntity = "PENDING";

    private String shippingAddressEntity;

    private LocalDateTime estimatedDeliveryEntity;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
    private List<OrderItem> orderItemsEntity;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
