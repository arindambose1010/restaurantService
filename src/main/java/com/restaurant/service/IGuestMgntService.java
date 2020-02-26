package com.restaurant.service;

import com.restaurant.model.GuestDetails;
import com.restaurant.model.GuestReviewDetails;
import com.restaurant.model.PurchaseDetails;
import com.restaurant.model.ServiceResponse;

public interface IGuestMgntService {
	
	ServiceResponse getAllReviewType();

	ServiceResponse addGuestDetails(GuestDetails guestDtls);
	
	ServiceResponse addGuestReview(GuestReviewDetails guestReviewDetails);
}
