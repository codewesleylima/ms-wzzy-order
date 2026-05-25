package com.wzzy.library.msorder.repository;

import com.wzzy.library.msorder.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, String> {
    List<CartItem> findByShoppingCartId(String shoppingCartId);
    Optional<CartItem> findByShoppingCartIdAndBookId(String shoppingCartId, String bookId);
    void deleteByShoppingCartId(String shoppingCartId);
}
