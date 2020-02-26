package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.IPurchaseMgntDao;
import com.restaurant.model.PurchaseDetails;
import com.restaurant.model.ServiceResponse;


@Service
public class PurchaseMgntServiceImpl implements IPurchaseMgntService {

	
	@Autowired
	IPurchaseMgntDao iPurchaseMgntDao;
	
	@Override
	public ServiceResponse getAllPaymentMode() {
		// TODO Auto-generated method stub
		return iPurchaseMgntDao.getAllPaymentMode();
	}

	@Override
	public ServiceResponse getAllTaxDtl() {
		// TODO Auto-generated method stub
		return iPurchaseMgntDao.getAllTaxDtl();
	}

	@Override
	public ServiceResponse addPurchaseDetails(PurchaseDetails purchaseDetl) {
		// TODO Auto-generated method stub
		return iPurchaseMgntDao.addPurchaseDetails(purchaseDetl);
	}
	

}
