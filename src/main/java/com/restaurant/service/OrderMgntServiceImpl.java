package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.IOrderMgntDao;


@Service
public class OrderMgntServiceImpl implements IOrderMgntService {
	
	@Autowired
	IOrderMgntDao iOrderMgntDao;
	

}
