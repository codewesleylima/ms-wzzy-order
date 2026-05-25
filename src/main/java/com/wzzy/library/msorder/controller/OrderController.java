package com.wzzy.library.msorder.controller;

import com.wzzy.library.bfflibrary.dto.ApiResponse;
import com.wzzy.library.bfflibrary.dto.PaginationDTO;
import com.wzzy.library.msorder.dto.OrderDTO;
import com.wzzy.library.msorder.enums.OrderStatus;
import com.wzzy.library.msorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<ApiResponse<OrderDTO>> createOrder(@RequestBody OrderDTO orderDTO) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<OrderDTO>> getOrderById(@PathVariable String id) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/number/{orderNumber}")
    public ResponseEntity<ApiResponse<OrderDTO>> getOrderByOrderNumber(@PathVariable String orderNumber) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<ApiResponse<PaginationDTO<OrderDTO>>> getOrdersByCustomerId(
            @PathVariable String customerId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<ApiResponse<PaginationDTO<OrderDTO>>> getOrdersByStatus(
            @PathVariable OrderStatus status,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        // Implementation will be done by developer
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<OrderDTO>> updateOrder(
            @PathVariable String id,
            @RequestBody OrderDTO orderDTO) {
        // Implementation will be done by developer
        return null;
    }

    @PutMapping("/{id}/status/{status}")
    public ResponseEntity<ApiResponse<OrderDTO>> updateOrderStatus(
            @PathVariable String id,
            @PathVariable OrderStatus status) {
        // Implementation will be done by developer
        return null;
    }

    @PostMapping("/{id}/cancel")
    public ResponseEntity<ApiResponse<Void>> cancelOrder(@PathVariable String id) {
        // Implementation will be done by developer
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteOrder(@PathVariable String id) {
        // Implementation will be done by developer
        return null;
    }
}
