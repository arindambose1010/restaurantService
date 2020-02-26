package com.restaurant.service;

import com.restaurant.model.ServiceResponse;

public interface ICategoryMgntService {

	ServiceResponse getAllCategory();
	ServiceResponse getAllItem();
	
	ServiceResponse addCategory(String category );
}
