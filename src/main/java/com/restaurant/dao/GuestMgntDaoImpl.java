package com.restaurant.dao;



import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import com.restaurant.model.GuestDetails;
import com.restaurant.model.GuestReviewDetails;
import com.restaurant.model.ServiceResponse;

@Component
public class GuestMgntDaoImpl implements IGuestMgntDao {
	
	private final Logger logger=Logger.getLogger(GuestMgntDaoImpl.class);

	@Autowired
	JdbcTemplate jdbcTemplate;
		
	
	@Override
	public ServiceResponse addGuestDetails(GuestDetails guestDtls) {
        		
		 logger.info("******Purchase Management Dao Impl  *********");
		   logger.info("data========"+guestDtls.toString()); 
		    ServiceResponse response=new ServiceResponse();
		    try {
		    	int flag=0;
		     Date date=new Date();
		     
			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
					.withTableName("GUEST_DETAIL")
					.usingGeneratedKeyColumns("Guest_ID");
		      
		           Map<String, Object> parameters = new HashMap<String, Object>();
		                   parameters.put("Restaurant_ID", guestDtls.getRestaurantId());
		                   parameters.put("title", guestDtls.getTitle());
		                   parameters.put("Guest_Name", guestDtls.getGuestName());
		                   parameters.put("Phone", guestDtls.getGuestNumber());
		                   parameters.put("EmailAddress", guestDtls.getGuestEmail());
		                   parameters.put("Birthdate", guestDtls.getBirthdate());
		                   parameters.put("AnniversaryDT", guestDtls.getAniversaryDate());
					       parameters.put("Booking_End_Time",guestDtls.getBookingEndTime()); 
					       parameters.put("Review_ID", null);
					       parameters.put("Event_ID", guestDtls.getEventId());
					       parameters.put("status", null);
		                   parameters.put("Create_Date",date);
		                   parameters.put("Created_By", "Admin");
		                   parameters.put("Modify_Date", null);
		                   parameters.put("Modified_By", null);
		              
		                //execute insert
		                    Number key = null;
		                  try {
		                          key = jdbcInsert.execute(new MapSqlParameterSource(parameters));
		                          jdbcInsert = null;
		                       } catch (Exception e) {
		                                     throw new Exception(e.getMessage());
		                       }
		                       //set generated key
		                  flag = key.intValue();
				if(flag>0) {
					response.setStatus("Success");
					response.setResponseMessage("Successfully Inserted");
					response.setResObject(null);
				}else {
					response.setStatus("Fail");
					response.setResponseMessage("Data not Inserted");
					response.setResObject(null);	
				}
				
				
				
		    }catch(Exception e) {
		    	logger.info("Execption----"+e.getMessage());
		    	response.setStatus("Fail");
				response.setResponseMessage("Exception--"+e.getMessage());
				response.setResObject(null);
		    }
				
				
				
				return response;
			
	}


	@Override
	public ServiceResponse addGuestReview(GuestReviewDetails guestReviewDetails) {
	
		 logger.info("******Purchase Management Dao Impl  *********");
		    
		    ServiceResponse response=new ServiceResponse();
		    try {
		    	int flag=0;
		     Date date=new Date();
		     
			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
					.withTableName("GUEST_REVIEW_MAP")
					.usingGeneratedKeyColumns("GUEST_REVIEW_MAP_ID");
		      
		           Map<String, Object> parameters = new HashMap<String, Object>();
//		                   parameters.put("Restaurant_ID", guestDtls.getRestaurantId());
//		                   parameters.put("title", guestDtls.getTitle());
//		                   parameters.put("Guest_Name", guestDtls.getGuestName());
//		                   parameters.put("Phone", guestDtls.getGuestNumber());
//		                   parameters.put("EmailAddress", guestDtls.getGuestEmail());
//		                   parameters.put("Birthdate", guestDtls.getBirthdate());
//		                   parameters.put("AnniversaryDT", guestDtls.getAniversaryDate());
//					       parameters.put("Booking_End_Time",null); 
//					       parameters.put("Review_ID", null);
//					       parameters.put("Event_ID", guestDtls.getEventId());
//					       parameters.put("status", null);
//		                   parameters.put("Create_Date",date);
//		                   parameters.put("Created_By", "Admin");
//		                   parameters.put("Modify_Date", null);
//		                   parameters.put("Modified_By", null);
		              
		                //execute insert
		                    Number key = null;
		                  try {
		                          key = jdbcInsert.execute(new MapSqlParameterSource(parameters));
		                          jdbcInsert = null;
		                       } catch (Exception e) {
		                                     throw new Exception(e.getMessage());
		                       }
		                       //set generated key
		                  flag = key.intValue();
				if(flag>0) {
					response.setStatus("Success");
					response.setResponseMessage("Successfully Inserted");
					response.setResObject(null);
				}else {
					response.setStatus("Fail");
					response.setResponseMessage("Data not Inserted");
					response.setResObject(null);	
				}
				
				
				
		    }catch(Exception e) {
		    	logger.info("Execption----"+e.getMessage());
		    	response.setStatus("Fail");
				response.setResponseMessage("Exception--"+e.getMessage());
				response.setResObject(null);
		    }
				
				
				
				return response;
	} 
}
