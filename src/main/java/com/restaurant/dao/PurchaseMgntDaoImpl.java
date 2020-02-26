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

import com.restaurant.model.PurchaseDetails;
import com.restaurant.model.ServiceResponse;


@Component
public class PurchaseMgntDaoImpl implements IPurchaseMgntDao {

	
	private final Logger logger=Logger.getLogger(PurchaseMgntDaoImpl.class);

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public ServiceResponse getAllPaymentMode() {
		// TODO Auto-generated method stub
		ServiceResponse reponse =null;
		
		return reponse;
	}

	@Override
	public ServiceResponse getAllTaxDtl() {
		// TODO Auto-generated method stub
		
		ServiceResponse reponse=null;
		
		return reponse;
	}

	@Override
	public ServiceResponse addPurchaseDetails(PurchaseDetails purchaseDetl) {
		 logger.info("******Purchase Management Dao Impl  *********");
		    
		    ServiceResponse response=new ServiceResponse();
		    try {
		    	int flag=0;
		     Date date=new Date();
		     
			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
					.withTableName("PURCHASE_DETAIL")
					.usingGeneratedKeyColumns("Purchase_ID");
		      
		           Map<String, Object> parameters = new HashMap<String, Object>();
		                   parameters.put("TrxDate", date);
		                   parameters.put("Description", purchaseDetl.getDescription());
		                   parameters.put("Category_Type", purchaseDetl.getCategoryId());
		                   parameters.put("Quantity", purchaseDetl.getQuantity());
		                   parameters.put("Rate", purchaseDetl.getPrice());
		                   parameters.put("TotalCost", (purchaseDetl.getQuantity()*purchaseDetl.getPrice()));
					       parameters.put("Is_Active",'Y'); 
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
	
	
	
	
}
