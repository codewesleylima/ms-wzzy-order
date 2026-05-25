package com.wzzy.library.msorder.exception;

import com.wzzy.library.bfflibrary.exception.BaseServiceException;

public class CheckoutFailedException extends BaseServiceException {
    public CheckoutFailedException(String reason) {
        super("Checkout failed: " + reason, "CHECKOUT_FAILED", 400);
    }
}
