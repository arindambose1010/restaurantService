package com.restaurant.dao;

import com.restaurant.model.GuestDetails;
import com.restaurant.model.GuestReviewDetails;
import com.restaurant.model.ServiceResponse;

public interface IGuestMgntDao {

	
	
	ServiceResponse addGuestDetails(GuestDetails guestDtls);
	
	ServiceResponse addGuestReview(GuestReviewDetails guestReviewDetails);
}
