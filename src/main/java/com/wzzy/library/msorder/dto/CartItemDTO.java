package com.wzzy.library.msorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {

    private Long cartItemIdDTO;
    private Long cartIdDTO;
    private Long bookIdDTO;
    private Integer quantityDTO;
    private LocalDateTime addedDateDTO;
}
