package com.wzzy.library.msorder.repository;

import com.wzzy.library.msorder.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, String> {
    Optional<ShoppingCart> findByCustomerId(String customerId);
    List<ShoppingCart> findByActiveTrue();
    List<ShoppingCart> findByAbandonedAtBeforeAndActiveTrue(LocalDateTime date);
}
