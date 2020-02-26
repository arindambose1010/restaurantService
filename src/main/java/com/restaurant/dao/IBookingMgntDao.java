package com.restaurant.dao;

import com.restaurant.model.ServiceResponse;

public interface IBookingMgntDao {

	
	ServiceResponse getAllBookingStatus();
	
	ServiceResponse getAllBookingAllocation();
}
