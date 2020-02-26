package com.restaurant.dao;

import com.restaurant.model.CloseCounter;
import com.restaurant.model.OpenCounterDetails;
import com.restaurant.model.ServiceResponse;

public interface ICounterMgntDao {
	
	ServiceResponse addOpenCounterDetails(OpenCounterDetails openCounterDetails);
	
	ServiceResponse addCloseCounter(CloseCounter closeCounterDetails);
	

}
