package com.wzzy.library.msorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {

    private Long id;
    private Long cartId;
    private Long bookId;
    private Integer quantity;
    private LocalDateTime addedDate;
}
