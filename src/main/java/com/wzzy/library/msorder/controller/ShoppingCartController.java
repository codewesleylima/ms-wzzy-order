package com.wzzy.library.msorder.controller;

import com.wzzy.library.bfflibrary.dto.ApiResponse;
import com.wzzy.library.msorder.dto.CartItemDTO;
import com.wzzy.library.msorder.dto.ShoppingCartDTO;
import com.wzzy.library.msorder.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/shopping-cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<ApiResponse<ShoppingCartDTO>> getCart(@PathVariable String customerId) {
        // Implementation will be done by developer
        return null;
    }

    @PostMapping("/customer/{customerId}/items")
    public ResponseEntity<ApiResponse<ShoppingCartDTO>> addItemToCart(
            @PathVariable String customerId,
            @RequestBody CartItemDTO cartItemDTO) {
        // Implementation will be done by developer
        return null;
    }

    @DeleteMapping("/customer/{customerId}/items/{itemId}")
    public ResponseEntity<ApiResponse<ShoppingCartDTO>> removeItemFromCart(
            @PathVariable String customerId,
            @PathVariable String itemId) {
        // Implementation will be done by developer
        return null;
    }

    @PutMapping("/customer/{customerId}/items/{itemId}")
    public ResponseEntity<ApiResponse<ShoppingCartDTO>> updateItemQuantity(
            @PathVariable String customerId,
            @PathVariable String itemId,
            @RequestParam int quantity) {
        // Implementation will be done by developer
        return null;
    }

    @DeleteMapping("/customer/{customerId}")
    public ResponseEntity<ApiResponse<ShoppingCartDTO>> clearCart(@PathVariable String customerId) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/customer/{customerId}/total-items")
    public ResponseEntity<ApiResponse<Integer>> getCartTotalItems(@PathVariable String customerId) {
        // Implementation will be done by developer
        return null;
    }
}
