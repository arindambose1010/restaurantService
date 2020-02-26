package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.IReportsDao;


@Service
public class ReportsServiceImpl implements IReportsService {
	
	@Autowired
	IReportsDao reportsDao;
	
	

}
