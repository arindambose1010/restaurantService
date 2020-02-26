package com.restaurant.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import com.restaurant.model.RestaurantInfoAdvance;
import com.restaurant.model.RestaurantInfoBasicSettings;
import com.restaurant.model.RestaurantInfoGen;
import com.restaurant.model.ServiceResponse;


@Component
public class RestaurantMgntDaoImpl implements IRestaurantMgntDao {

	
	private final Logger logger=Logger.getLogger(RestaurantMgntDaoImpl.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	

	@Override
	public ServiceResponse getAllRestaurant() {
		// TODO Auto-generated method stub
		
		ServiceResponse response=null;
		return response;
	}

	@Override
	public ServiceResponse addRestaurantInfo(RestaurantInfoGen restaurantInfoGen) {
		 logger.info("******addRestaurantInfo Dao Impl  *********");
		    
		    ServiceResponse response=new ServiceResponse();
		    try {
		    	int flag=0;
		     Date date=new Date();
		     
			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
					.withTableName("RESTAURANT_MAST")
					.usingGeneratedKeyColumns("Restaurant_ID");
		      
		           Map<String, Object> parameters = new HashMap<String, Object>();
		                   parameters.put("Restaurant_Name",restaurantInfoGen.getName());
		                   parameters.put("Restaurant_Group_Name",restaurantInfoGen.getName());
		                   parameters.put("Address", restaurantInfoGen.getAddress());
		                   parameters.put("City",restaurantInfoGen.getCity());
		                   parameters.put("Country",restaurantInfoGen.getCountry());
		                   parameters.put("Pincode", restaurantInfoGen.getZipCode());
		                   parameters.put("ContactNo",restaurantInfoGen.getPhoneNO());
		                   parameters.put("Mobile_No",restaurantInfoGen.getMobileNO());
		                   parameters.put("Website", restaurantInfoGen.getWebsite());
		                   parameters.put("ContactMail",restaurantInfoGen.getEmail());
		                   parameters.put("GSTNo",restaurantInfoGen.getGstNo());
		                   parameters.put("Is_Active", 'Y');
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
	public ServiceResponse addRestaurantInfoBasicSetting(RestaurantInfoBasicSettings restaurantInfoBasic) {
		  logger.info("******addRestaurantInfoBasicSetting Dao Impl  *********");
		    
		    ServiceResponse response=new ServiceResponse();
		    try {
		    	String sql = "select Restaurant_ID from RESTAURANT_MAST where restaurant_name='"+restaurantInfoBasic.getRestaurantName()+"'";
				List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		        String restaurantId="";  
				if(null !=rows) {
		        logger.info("Size=="+rows.size());	   
				  for (Map<?, ?> row : rows) {
					  restaurantId=row.get("Restaurant_ID").toString();
				  }
				}
				  
		    	int flag=0;
		     Date date=new Date();
		     
			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
					.withTableName("RESTAURANT_BASIC_SETTINGS")
					.usingGeneratedKeyColumns("Id");
		      
		           Map<String, Object> parameters = new HashMap<String, Object>();
		                   parameters.put("Restaurant_mast_id",restaurantId);
		                   parameters.put("FincialYear_from",restaurantInfoBasic.getFinYearFrom());
		                   parameters.put("FinancialYear_to",restaurantInfoBasic.getFinYearTo());
		                   parameters.put("Countertime_start",restaurantInfoBasic.getCounterTimingFrom());
		                   parameters.put("Countertime_end",restaurantInfoBasic.getCounterTimingTo());
		                   parameters.put("Currency_mast_id",restaurantInfoBasic.getCurrency());
		                   parameters.put("Currency_conversion_id",restaurantInfoBasic.getConversionRate());
		                   parameters.put("NoOfRestaurant",restaurantInfoBasic.getNoOfRestaurant());
		                   parameters.put("NoOfBanquet",restaurantInfoBasic.getNoOfBanquet());
		                   parameters.put("Decimal_place",restaurantInfoBasic.getDecimalPlace());
		                   parameters.put("Language_Type",restaurantInfoBasic.getDefaultLanguage());
		                   parameters.put("Date_format",restaurantInfoBasic.getDateFormat());
		                   parameters.put("Time_zone",restaurantInfoBasic.getTimeZone());
		                   parameters.put("Time_format",restaurantInfoBasic.getTimeFormat());
		                   parameters.put("Create_date",date);
		                   parameters.put("Created_By", "Admin");
		                   parameters.put("Modify_Date", null);
		                   parameters.put("Modified_by", null);
		              
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
					response.setResponseMessage("Data not Inserted Successfully");
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
	public ServiceResponse addRestaurantInfoAdvance(RestaurantInfoAdvance restaurantInfoAdvance) {
		logger.info("******addRestaurantInfoAdvance Dao Impl  *********");
	    logger.info("RestaurantInfoAdvance==="+restaurantInfoAdvance.toString());
	    ServiceResponse response=new ServiceResponse();
	    try {
	    	String sql = "select Restaurant_ID from RESTAURANT_MAST where restaurant_name='"+restaurantInfoAdvance.getRestName()+"'";
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
	        String restaurantId="";  
			if(null !=rows) {
	        logger.info("Size=="+rows.size());	   
			  for (Map<?, ?> row : rows) {
				  restaurantId=row.get("Restaurant_ID").toString();
			  }
			}
			  logger.info("restaurant Id=="+restaurantId);
	    	int flag=0;
	     Date date=new Date();
	     
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
				.withTableName("RESTAURANT_ADVANCE")
				.usingGeneratedKeyColumns("Id");
	      
	           Map<String, Object> parameters = new HashMap<String, Object>();
	                   parameters.put("Restaurant_Mast_Id",restaurantId);
	                   parameters.put("Rest_Ban_Type",restaurantInfoAdvance.getRestBanType());
	                   parameters.put("Res_Ban_Name",restaurantInfoAdvance.getRestaurantName());
	                   parameters.put("Manager_name",restaurantInfoAdvance.getManagerName());
	                   parameters.put("No_Of_Table",restaurantInfoAdvance.getNoOfTable());
	                   parameters.put("No_of_staff",restaurantInfoAdvance.getNoOfStaff());
	                   parameters.put("PhoneNo",restaurantInfoAdvance.getPhoneNo());
	                   parameters.put("Create_date",date);
	                   parameters.put("Created_By", "Admin");
	                   parameters.put("Modify_Date", null);
	                   parameters.put("Modified_by", null);
	              
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
				response.setResponseMessage("Data not Inserted Successfully");
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
