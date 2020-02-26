package com.restaurant.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.ICategoryMgntDao;
import com.restaurant.model.ServiceResponse;


@Service
public class CategoryMgntServiceImpl implements ICategoryMgntService{

	
	@Autowired
	ICategoryMgntDao categoryMgntDao;
	
	@Override
	public ServiceResponse getAllCategory() {
		// TODO Auto-generated method stub
		return categoryMgntDao.getAllCategory();
	}

	@Override
	public ServiceResponse getAllItem() {
		// TODO Auto-generated method stub
		return categoryMgntDao.getAllItem();
	}

	@Override
	public ServiceResponse addCategory(String category) {
		// TODO Auto-generated method stub
		return categoryMgntDao.addCategory(category);
	}
 
	
	
}
