package com.restaurant.dao;

import com.restaurant.model.ServiceResponse;

public interface ITableMgntDao {
	
	
	ServiceResponse  getAllTable();
    
	ServiceResponse getTableByRestaurant(String restaurantId);
	
	
	
}
