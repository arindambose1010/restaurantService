package com.restaurant.dao;

import com.restaurant.model.PurchaseDetails;
import com.restaurant.model.ServiceResponse;

public interface IPurchaseMgntDao {

	
	ServiceResponse getAllPaymentMode();
	
	ServiceResponse getAllTaxDtl();
	
	ServiceResponse  addPurchaseDetails(PurchaseDetails purchaseDetl);
}
