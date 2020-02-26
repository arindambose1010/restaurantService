package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.IRestaurantMgntDao;
import com.restaurant.model.RestaurantInfoAdvance;
import com.restaurant.model.RestaurantInfoBasicSettings;
import com.restaurant.model.RestaurantInfoGen;
import com.restaurant.model.ServiceResponse;


@Service
public class RestaurantMgntServiceImpl  implements IRestaurantMgntService{

	
	@Autowired
	IRestaurantMgntDao restaurantMgntDao;
	
	
	@Override
	public ServiceResponse getAllRestaurant() {
		// TODO Auto-generated method stub
		return restaurantMgntDao.getAllRestaurant();
	}


	@Override
	public ServiceResponse addRestaurantInfo(RestaurantInfoGen restaurantInfoGen) {
		// TODO Auto-generated method stub
		return restaurantMgntDao.addRestaurantInfo(restaurantInfoGen);
	}


	@Override
	public ServiceResponse addRestaurantInfoBasicSetting(RestaurantInfoBasicSettings restaurantInfoBasicSettings) {
		// TODO Auto-generated method stub
		return restaurantMgntDao.addRestaurantInfoBasicSetting(restaurantInfoBasicSettings);
	}


	@Override
	public ServiceResponse addRestaurantInfoAdvance(RestaurantInfoAdvance restaurantInfoAdvance) {
		// TODO Auto-generated method stub
		return restaurantMgntDao.addRestaurantInfoAdvance(restaurantInfoAdvance);
	}

}
