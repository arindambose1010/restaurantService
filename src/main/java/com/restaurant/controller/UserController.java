package com.restaurant.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.ServiceResponse;
import com.restaurant.service.ICommonService;
import com.restaurant.service.ITableMgntService;

@RestController
@RequestMapping(value = "/userCtrl")
@CrossOrigin
public class UserController {
	
	
	private final Logger logger = Logger.getLogger(UserController.class);
	
	
	@Autowired
	ICommonService commonService;
	
	
	@RequestMapping(value = "/getStaffDtls", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getStaffDtls() {
		logger.info("*******Request for getStaffDtls ******");
		ServiceResponse response = null;
		String type="StaffDetail";
		try {
			response = commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	@RequestMapping(value = "/getAllEvent", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllEvent() {
		logger.info("*******Request for getAllEvent ******");
		ServiceResponse response = null;
		String type="MASTER_EVENT";
		try {
			response = commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}

}
