package com.wzzy.library.msorder.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {
    private String id;
    private String orderId;
    private String bookId;
    private String bookTitle;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
    private String isbn;
    private String addedAt;
}
