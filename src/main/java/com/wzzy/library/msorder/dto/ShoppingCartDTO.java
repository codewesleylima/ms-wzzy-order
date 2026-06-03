package com.wzzy.library.msorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartDTO {

    private Long shoppingCartIdDTO;
    private Long customerIdDTO;
    private LocalDateTime createdDateDTO;
    private LocalDateTime expiryDateDTO;
    private String statusDTO;
}
