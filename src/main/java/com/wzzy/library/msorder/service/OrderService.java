package com.wzzy.library.msorder.service;

import com.wzzy.library.bfflibrary.dto.PaginationDTO;
import com.wzzy.library.msorder.dto.OrderDTO;
import com.wzzy.library.msorder.enums.OrderStatus;

public interface OrderService {
    OrderDTO createOrder(OrderDTO orderDTO);
    OrderDTO getOrderById(String id);
    OrderDTO getOrderByOrderNumber(String orderNumber);
    PaginationDTO<OrderDTO> getOrdersByCustomerId(String customerId, int page, int size);
    PaginationDTO<OrderDTO> getOrdersByStatus(OrderStatus status, int page, int size);
    OrderDTO updateOrder(String id, OrderDTO orderDTO);
    OrderDTO updateOrderStatus(String id, OrderStatus status);
    void cancelOrder(String id);
    void deleteOrder(String id);
}
