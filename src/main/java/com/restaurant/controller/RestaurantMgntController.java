package com.restaurant.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.RestaurantInfoAdvance;
import com.restaurant.model.RestaurantInfoBasicSettings;
import com.restaurant.model.RestaurantInfoGen;
import com.restaurant.model.ServiceResponse;
import com.restaurant.service.ICommonService;
import com.restaurant.service.IRestaurantMgntService;



@RestController
@RequestMapping(value="/restaurantCtrl")
@CrossOrigin
public class RestaurantMgntController {

	private final Logger logger=Logger.getLogger(RestaurantMgntController.class);
	
	
	@Autowired
	IRestaurantMgntService restaurantMgntService;
	
	@Autowired
	ICommonService commonService;
	
	
	
	@RequestMapping(value = "/getAllRestaurant", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllRestaurant() {
		logger.info("*******Request for getAllRestaurant ******");
		ServiceResponse response = null;
		String type="RestaurantType";
		try {
			response = commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	@RequestMapping(value = "/getAllCurrency", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllCurrency() {
		logger.info("*******Request for getAllCurrency ******");
		ServiceResponse response = null;
		String type="MASTER_CURRENCY";
		try {
			response=commonService.getAllMasterData(type);
			//response = categoryMgntService.getAllItem();
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	@RequestMapping(value = "/getAllCurrencyConverter", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllCurrencyConverter() {
		logger.info("*******Request for getAllCurrencyConverter ******");
		ServiceResponse response = null;
		String type="MASTER_CURRENCYCONVERTER";
		try {
			response=commonService.getAllMasterData(type);
			//response = categoryMgntService.getAllItem();
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	
	@RequestMapping(value = "/addRestaurantInfo", method = RequestMethod.POST)
	@ResponseBody
	public ServiceResponse addRestaurantInfo(@RequestBody RestaurantInfoGen restaurantInfoGen) {
		logger.info("*******Request for addRestaurantInfo ******");
		ServiceResponse response = null;
		
		try {
			response=restaurantMgntService.addRestaurantInfo(restaurantInfoGen);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	@RequestMapping(value = "/addRestaurantInfoBasicSetting", method = RequestMethod.POST)
	@ResponseBody
	public ServiceResponse addRestaurantInfoBasicSetting(@RequestBody RestaurantInfoBasicSettings restaurantInfoBasic) {
		logger.info("*******Request for addRestaurantInfoBasicSetting ******");
		ServiceResponse response = null;
		
		try {
			response=restaurantMgntService.addRestaurantInfoBasicSetting(restaurantInfoBasic);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	@RequestMapping(value = "/addRestaurantInfoAdvance", method = RequestMethod.POST)
	@ResponseBody
	public ServiceResponse addRestaurantInfoAdvance(@RequestBody RestaurantInfoAdvance restaurantInfoAdvance) {
		logger.info("*******Request for addRestaurantInfoAdvance ******");
		ServiceResponse response = null;
		
		try {
			response=restaurantMgntService.addRestaurantInfoAdvance(restaurantInfoAdvance);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
}
