package com.restaurant.service;

import com.restaurant.model.ServiceResponse;

public interface ITableMgntService {
	
	ServiceResponse getAllTable();
	
	ServiceResponse getTableByRestaurant(String restaurantId);

}
