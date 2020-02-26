package com.restaurant.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.ServiceResponse;
import com.restaurant.service.ICommonService;
import com.restaurant.service.ITableMgntService;



@RestController
@RequestMapping(value="/tableCtrl")
@CrossOrigin
public class TableMgntController {

	
	private final Logger logger=Logger.getLogger(TableMgntController.class);
	
	
	@Autowired
	ITableMgntService tableMgntService;
	
	@Autowired
	ICommonService commonService;
	
	
	
	@RequestMapping(value = "/getTableMst", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllTable() {
		logger.info("*******Request for getAllTable ******");
		ServiceResponse response = null;
		String type="MASTER_TableMst";
		try {
			response = commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	
	@RequestMapping(value = "/getTableMstByRestaurant", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getTableMstByRestaurant(@RequestParam String restaurantId) {
		logger.info("*******Request for getTableMstByRestaurant ******");
		ServiceResponse response = null;
		String type="TableMstByRestaurant";
		try {
			response = commonService.getAllMasterData(type,restaurantId);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	@RequestMapping(value = "/getTableByRestaurant", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getTableByRestaurant(@RequestParam String restaurantId) {
		logger.info("*******Request for getTableByRestaurant ******");
		ServiceResponse response = null;
		
		try {
			response = tableMgntService.getTableByRestaurant(restaurantId);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
}
