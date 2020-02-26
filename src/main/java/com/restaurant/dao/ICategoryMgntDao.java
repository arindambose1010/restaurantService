package com.restaurant.dao;

import com.restaurant.model.ServiceResponse;

public interface ICategoryMgntDao {

	
	ServiceResponse getAllCategory();
	
	ServiceResponse getAllItem();
	
	ServiceResponse addCategory(String category);
}
