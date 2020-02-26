package com.restaurant.service;

import com.restaurant.model.RestaurantInfoAdvance;
import com.restaurant.model.RestaurantInfoBasicSettings;
import com.restaurant.model.RestaurantInfoGen;
import com.restaurant.model.ServiceResponse;

public interface IRestaurantMgntService {

	ServiceResponse getAllRestaurant();
	
	ServiceResponse addRestaurantInfo(RestaurantInfoGen restaurantInfoGen);
	
	ServiceResponse addRestaurantInfoBasicSetting(RestaurantInfoBasicSettings restaurantInfoBasicSettings);
	
	ServiceResponse addRestaurantInfoAdvance(RestaurantInfoAdvance restaurantInfoAdvance);
	
}
