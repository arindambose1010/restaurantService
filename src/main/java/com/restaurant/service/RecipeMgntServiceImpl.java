package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.IRecipeMgntDao;
import com.restaurant.model.RecipeDetails;
import com.restaurant.model.ServiceResponse;


@Service
public class RecipeMgntServiceImpl implements IRecipeMgntService {
	
	@Autowired
	IRecipeMgntDao iRecipeMgntDao;

	@Override
	public ServiceResponse addRecipe(RecipeDetails recipeDtl) {
		// TODO Auto-generated method stub
		return iRecipeMgntDao.addRecipe(recipeDtl);
	}
	
	
	
	
	
	
	

}
