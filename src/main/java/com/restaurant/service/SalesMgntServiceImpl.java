package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.ISalesMgntDao;


@Service
public class SalesMgntServiceImpl implements ISalesMgntService{
	
	
	@Autowired
	ISalesMgntDao salesMgntDao;
	
	
	
	

}
