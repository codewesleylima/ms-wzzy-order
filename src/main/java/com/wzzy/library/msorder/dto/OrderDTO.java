package com.wzzy.library.msorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long orderIdDTO;
    private Long customerIdDTO;
    private LocalDateTime orderDateDTO;
    private BigDecimal totalPriceDTO;
    private String statusDTO;
    private String shippingAddressDTO;
    private LocalDateTime estimatedDeliveryDTO;
    private java.util.List<OrderItemDTO> orderItemsDTO;
    private LocalDateTime createdAtDTO;
    private LocalDateTime updatedAtDTO;
}
