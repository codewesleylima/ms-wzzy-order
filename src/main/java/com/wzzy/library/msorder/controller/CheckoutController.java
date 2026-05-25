package com.wzzy.library.msorder.controller;

import com.wzzy.library.bfflibrary.dto.ApiResponse;
import com.wzzy.library.msorder.dto.CheckoutDTO;
import com.wzzy.library.msorder.dto.OrderDTO;
import com.wzzy.library.msorder.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/checkout")
public class CheckoutController {

    @Autowired
    private CheckoutService checkoutService;

    @PostMapping
    public ResponseEntity<ApiResponse<OrderDTO>> processCheckout(@RequestBody CheckoutDTO checkoutDTO) {
        // Implementation will be done by developer
        return null;
    }

    @PostMapping("/validate")
    public ResponseEntity<ApiResponse<Void>> validateCheckout(@RequestBody CheckoutDTO checkoutDTO) {
        // Implementation will be done by developer
        return null;
    }
}
