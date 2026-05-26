package com.wzzy.library.msorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartDTO {

    private Long id;
    private Long customerId;
    private LocalDateTime createdDate;
    private LocalDateTime expiryDate;
    private String status;
}
