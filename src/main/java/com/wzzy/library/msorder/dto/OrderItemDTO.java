package com.wzzy.library.msorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {

    private Long orderItemIdDTO;
    private Long orderIdDTO;
    private Long bookIdDTO;
    private Integer quantityDTO;
    private BigDecimal pricePerUnitDTO;
    private BigDecimal subtotalDTO;
}
