package com.wzzy.library.msorder.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartDTO {
    private String id;
    private String customerId;
    private int totalItems;
    private BigDecimal totalPrice;
    private List<CartItemDTO> items;
    private boolean active;
    private String createdAt;
    private String updatedAt;
    private String lastAccessedAt;
    private String abandonedAt;
}
