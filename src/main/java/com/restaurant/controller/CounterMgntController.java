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

import com.restaurant.model.CloseCounter;
import com.restaurant.model.OpenCounterDetails;
import com.restaurant.model.ServiceResponse;
import com.restaurant.service.ICommonService;
import com.restaurant.service.ICounterMgntService;



@RestController
@RequestMapping(value="/counterCtrl")
@CrossOrigin
public class CounterMgntController {

	
	private final Logger logger=Logger.getLogger(CounterMgntController.class);
	
	
	@Autowired
	ICounterMgntService counterMgntService;
	
	@Autowired
	ICommonService commonService;
	
	@RequestMapping(value = "/getOpenCounterDetails", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getOpenCounterDetails() {
		logger.info("*******Request for getOpenCounterDetails ******");
		ServiceResponse response = null;
		String type="OpenCounterDetails";
		try {
			response=commonService.getAllMasterData(type);
			//response = categoryMgntService.getAllItem();
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	@RequestMapping(value = "/addOpenCounterDetails", method = RequestMethod.POST)
	@ResponseBody
	public ServiceResponse addOpenCounterDetails(@RequestBody OpenCounterDetails openCounterDetails) {
		logger.info("*******Request for addOpenCounterDetails ******");
		ServiceResponse response = null;
		
		try {
			response=counterMgntService.addOpenCounterDetails(openCounterDetails);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	@RequestMapping(value = "/getCloseCounterDetails", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getCloseCounterDetails() {
		logger.info("*******Request for getCloseCounterDetails ******");
		ServiceResponse response = null;
		String type="CLOSE_COUNTER_DETAILS";
		try {
			response=commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}

	@RequestMapping(value = "/addCloseCounter", method = RequestMethod.POST)
	@ResponseBody
	public ServiceResponse addCloseCounter(@RequestBody CloseCounter closeCounterDetail) {
		logger.info("*******Request for addCloseCounter ******");
		ServiceResponse response = null;
		
		try {
			response=counterMgntService.addCloseCounter(closeCounterDetail);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
}
