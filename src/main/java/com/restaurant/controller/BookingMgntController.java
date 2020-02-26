package com.restaurant.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.LoginDetails;
import com.restaurant.model.ModulesAllowed;
import com.restaurant.model.PropertyAddons;
import com.restaurant.model.ServiceResponse;
import com.restaurant.service.IBookingMgntService;
import com.restaurant.service.ICommonService;

@RestController
@RequestMapping(value = "/bookingCtrl")
@CrossOrigin
public class BookingMgntController {

	private final Logger logger = Logger.getLogger(BookingMgntController.class);

	@Autowired
	IBookingMgntService bookingMgntService;
	
	@Autowired
    ICommonService commonService;
	
	@RequestMapping(value = "/getAllBookingStatus", method = RequestMethod.GET)

	@ResponseBody
	public ServiceResponse getAllBookingStatus() {
		logger.info("*******Request for getAllBookingStatus ******");
		ServiceResponse response = null;
		String type="MASTER_BookingStatus";
		try {
			 
			response=commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	@RequestMapping(value = "/getLoginData/{resId}", method = RequestMethod.POST)
	public @ResponseBody ServiceResponse getLoginData(@PathVariable String resId) throws Exception {
        
		ServiceResponse response=new ServiceResponse();
		
		
		//res.setHeader("token", "Bearer "+token);
		LoginDetails ldts=new LoginDetails();
		PropertyAddons pd=new PropertyAddons();
		ModulesAllowed modulesAllowed=new ModulesAllowed();
		
		pd.setFlexiPrice(true);
		
		ldts.setIs_Valid(true);
		ldts.setSubsStatus("Active");
		ldts.setExpiryDate("2020-11-22 00:00:00.0");
		ldts.setUserName("AjayKumar");
		ldts.setUserType("User");
		ldts.setIs_super_user(true);
		ldts.setHotelID("1");
		ldts.setBusinessDate("2019-12-14");
		ldts.setPropertyAddons(pd);
		ldts.setTaxType("GST");
		ldts.setTaxNumber("GSTIN89746873645");  
		//ldts.setToken(token);
		String[] arre=new String[0];
		modulesAllowed.setModules(arre);
		ldts.setModulesAllowed(modulesAllowed);
		response.setStatus("Suucess");
		response.setResponseMessage("Success");
		response.setSearchCount(1);
		response.setResObject(ldts);
		
		return response;
		
	}
	
	

	@RequestMapping(value = "/getAllBookingAllocation", method = RequestMethod.GET)

	@ResponseBody
	public ServiceResponse getAllBookingAllocation() {
		logger.info("*******Request for getAllBookingAllocation ******");
		ServiceResponse response = null;
		String type="BookingAllocation";
		try {
		  response=commonService.getAllMasterData(type);	
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}

}
