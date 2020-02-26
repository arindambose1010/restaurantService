package com.restaurant.dao;

import com.restaurant.model.RestaurantInfoAdvance;
import com.restaurant.model.RestaurantInfoBasicSettings;
import com.restaurant.model.RestaurantInfoGen;
import com.restaurant.model.ServiceResponse;

public interface IRestaurantMgntDao {
	
	ServiceResponse getAllRestaurant();
	
	ServiceResponse addRestaurantInfo(RestaurantInfoGen restaurantInfoGen); 
	
	ServiceResponse addRestaurantInfoBasicSetting(RestaurantInfoBasicSettings restaurantInfoBasic); 
	
	ServiceResponse addRestaurantInfoAdvance(RestaurantInfoAdvance restaurantInfoAdvance); 
	

}
