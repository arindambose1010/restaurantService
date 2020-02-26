package com.restaurant.dao;

import com.restaurant.model.ServiceResponse;

public interface ICommonDao {

	
	ServiceResponse executeQuery(String[] keyDetails,String actionType);

	void getAllConfigData();
}
