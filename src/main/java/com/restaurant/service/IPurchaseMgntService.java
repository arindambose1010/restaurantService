package com.restaurant.service;

import com.restaurant.model.PurchaseDetails;
import com.restaurant.model.ServiceResponse;

public interface IPurchaseMgntService {

	
	ServiceResponse getAllPaymentMode();
	
	ServiceResponse getAllTaxDtl();
	
	ServiceResponse addPurchaseDetails(PurchaseDetails purchaseDetl);
}
