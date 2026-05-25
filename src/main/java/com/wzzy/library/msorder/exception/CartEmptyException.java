package com.wzzy.library.msorder.exception;

import com.wzzy.library.bfflibrary.exception.ValidationException;

public class CartEmptyException extends ValidationException {
    public CartEmptyException() {
        super("Shopping cart is empty. Add items before checkout.", "CART_EMPTY");
    }
}
