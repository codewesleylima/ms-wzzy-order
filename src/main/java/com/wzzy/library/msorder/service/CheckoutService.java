package com.wzzy.library.msorder.service;

import com.wzzy.library.msorder.dto.CheckoutDTO;
import com.wzzy.library.msorder.dto.OrderDTO;

public interface CheckoutService {
    OrderDTO processCheckout(CheckoutDTO checkoutDTO);
    void validateCheckout(CheckoutDTO checkoutDTO);
    void validateShippingAddress(String customerId, String addressId);
    void validateBillingAddress(String customerId, String addressId);
}
