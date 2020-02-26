package com.restaurant.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.IBookingMgntDao;
import com.restaurant.model.ServiceResponse;


@Service
public class BookingMgntServiceImpl implements IBookingMgntService{

	
	@Autowired
	IBookingMgntDao iBookingMgntDao;
	
	@Override
	public ServiceResponse getAllBookingStatus() {
		// TODO Auto-generated method stub
		return iBookingMgntDao.getAllBookingStatus();
		
	}

	@Override
	public ServiceResponse getAllBookingAllocation() {
		// TODO Auto-generated method stub
		return iBookingMgntDao.getAllBookingAllocation();
	}
	
	

}
