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
public class CheckoutDTO {
    private String customerId;
    private String shippingAddressId;
    private String billingAddressId;
    private BigDecimal discountCode;
    private String couponCode;
    private String notes;
}
