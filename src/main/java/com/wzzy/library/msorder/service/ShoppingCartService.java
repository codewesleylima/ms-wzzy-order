package com.wzzy.library.msorder.service;

import com.wzzy.library.msorder.dto.CartItemDTO;
import com.wzzy.library.msorder.dto.ShoppingCartDTO;

public interface ShoppingCartService {
    ShoppingCartDTO getCartByCustomerId(String customerId);
    ShoppingCartDTO addItemToCart(String customerId, CartItemDTO cartItemDTO);
    ShoppingCartDTO removeItemFromCart(String customerId, String cartItemId);
    ShoppingCartDTO updateItemQuantity(String customerId, String cartItemId, int quantity);
    ShoppingCartDTO clearCart(String customerId);
    int getCartTotalItems(String customerId);
}
