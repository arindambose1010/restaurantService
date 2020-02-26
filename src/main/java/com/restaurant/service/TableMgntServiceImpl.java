package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.ITableMgntDao;
import com.restaurant.model.ServiceResponse;



@Service
public class TableMgntServiceImpl implements ITableMgntService {

	@Autowired
	ITableMgntDao iTableMgntDao;
	
	@Override
	public ServiceResponse getAllTable() {
		// TODO Auto-generated method stub
		return iTableMgntDao.getAllTable();
	}

	@Override
	public ServiceResponse getTableByRestaurant(String restaurantId) {
		// TODO Auto-generated method stub
		
		return iTableMgntDao.getTableByRestaurant(restaurantId);
	}

}
