package com.wzzy.library.msorder.dto;

import com.wzzy.library.msorder.enums.OrderStatus;
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
public class OrderDTO {
    private String id;
    private String orderNumber;
    private String customerId;
    private OrderStatus status;
    private BigDecimal totalAmount;
    private BigDecimal discountAmount;
    private BigDecimal taxAmount;
    private BigDecimal shippingCost;
    private String shippingAddress;
    private String billingAddress;
    private String notes;
    private String trackingNumber;
    private List<OrderItemDTO> items;
    private String createdAt;
    private String updatedAt;
    private String shippedAt;
    private String deliveredAt;
    private String cancelledAt;
}
