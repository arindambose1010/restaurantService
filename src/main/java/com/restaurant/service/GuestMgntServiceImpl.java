package com.restaurant.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.IGuestMgntDao;
import com.restaurant.model.GuestDetails;
import com.restaurant.model.GuestReviewDetails;
import com.restaurant.model.PurchaseDetails;
import com.restaurant.model.ServiceResponse;


@Service
public class GuestMgntServiceImpl implements IGuestMgntService {
	
	@Autowired
	IGuestMgntDao guestMgntDao;

	@Override
	public ServiceResponse getAllReviewType() {
		// TODO Auto-generated method stub
		ServiceResponse response=null;
		return response;
	}

	@Override
	public ServiceResponse addGuestDetails(GuestDetails guestDtls) {
		// TODO Auto-generated method stub
		return guestMgntDao.addGuestDetails(guestDtls);
	}

	@Override
	public ServiceResponse addGuestReview(GuestReviewDetails guestReviewDetails) {
		// TODO Auto-generated method stub
		return guestMgntDao.addGuestReview(guestReviewDetails);
	}

	

}
