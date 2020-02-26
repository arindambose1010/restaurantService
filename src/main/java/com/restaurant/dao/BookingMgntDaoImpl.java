package com.restaurant.dao;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restaurant.model.BookingStatusMst;
import com.restaurant.model.ServiceResponse;


@Component
public class BookingMgntDaoImpl implements IBookingMgntDao{

	
	
	private final Logger logger=Logger.getLogger(BookingMgntDaoImpl.class);

	@Override
	public ServiceResponse getAllBookingStatus() {
		// TODO Auto-generated method stub
	logger.info("DAO : getAllBookingStatus::");
		ServiceResponse response=null;
		BookingStatusMst bsm=new BookingStatusMst();
		bsm.setBookingStatusId(1);
		response.setStatus("Success");
		response.setResponseMessage("Success");
		response.setResObject(bsm);
		response.setSearchCount(1);
		response.setStatusCode("200");
		logger.info("DAO:: response"+response);
		return response;
	}

	@Override
	public ServiceResponse getAllBookingAllocation() {
		// TODO Auto-generated method stub
		ServiceResponse response=null;
		
		return response;
	}
	
	
	
	
	
}
