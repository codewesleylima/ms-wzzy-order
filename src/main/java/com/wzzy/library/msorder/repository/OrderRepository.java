package com.wzzy.library.msorder.repository;

import com.wzzy.library.msorder.entity.Order;
import com.wzzy.library.msorder.enums.OrderStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
    Optional<Order> findByOrderNumber(String orderNumber);
    Page<Order> findByCustomerId(String customerId, Pageable pageable);
    Page<Order> findByStatus(OrderStatus status, Pageable pageable);
    List<Order> findByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate);
    Page<Order> findByCustomerIdAndStatus(String customerId, OrderStatus status, Pageable pageable);
}
