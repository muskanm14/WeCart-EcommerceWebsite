package com.muskan.ecommerce.service;

import com.muskan.ecommerce.dto.Purchase;
import com.muskan.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
	PurchaseResponse placeOrder(Purchase purchase);
}
