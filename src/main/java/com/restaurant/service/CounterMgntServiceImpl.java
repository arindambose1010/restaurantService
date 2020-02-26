package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.ICounterMgntDao;
import com.restaurant.model.CloseCounter;
import com.restaurant.model.OpenCounterDetails;
import com.restaurant.model.ServiceResponse;

@Service
public class CounterMgntServiceImpl implements ICounterMgntService{
	
	@Autowired 
	ICounterMgntDao counterMgntDao;

	@Override
	public ServiceResponse addOpenCounterDetails(OpenCounterDetails openCounterDetails) {
		// TODO Auto-generated method stub
		return counterMgntDao.addOpenCounterDetails(openCounterDetails);
	}

	@Override
	public ServiceResponse addCloseCounter(CloseCounter closeCounterDetails) {
		// TODO Auto-generated method stub
		return counterMgntDao.addCloseCounter(closeCounterDetails);
	}
	
	

}
