package com.wzzy.library.msorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {

    private Long id;
    private Long orderId;
    private Long bookId;
    private Integer quantity;
    private BigDecimal pricePerUnit;
    private BigDecimal subtotal;
}
