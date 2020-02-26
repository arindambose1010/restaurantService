package com.restaurant.service;

import com.restaurant.model.CloseCounter;
import com.restaurant.model.OpenCounterDetails;
import com.restaurant.model.ServiceResponse;

public interface ICounterMgntService {

	
	ServiceResponse addOpenCounterDetails(OpenCounterDetails openCounterDetails);

	ServiceResponse addCloseCounter(CloseCounter closeCounterDetails);
}
