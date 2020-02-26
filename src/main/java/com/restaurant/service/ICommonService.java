package com.restaurant.service;

import com.restaurant.model.ServiceResponse;

public interface ICommonService {
	
	
	
	ServiceResponse getAllMasterData(String... keyDetails);

	void getAllConfigData();
}