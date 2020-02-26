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

import com.restaurant.model.ServiceResponse;


@Component
public class CategoryMgntDaoImpl implements ICategoryMgntDao {
	
	private final Logger logger=Logger.getLogger(CategoryMgntDaoImpl.class);

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public ServiceResponse getAllCategory() {
		// TODO Auto-generated method stub
		ServiceResponse response=null;
		
		return response;
	}

	@Override
	public ServiceResponse getAllItem() {
		// TODO Auto-generated method stub
		ServiceResponse response=null;
		
		return response;
	}

	@Override
	public ServiceResponse addCategory(String category) {
    logger.info("******Category Management Dao Impl  *********");
    
    ServiceResponse response=new ServiceResponse();
    try {
    	int flag=0;
     Date date=new Date();
     int i=1;
	SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
			.withTableName("CATEGORY_MAST")
			.usingGeneratedKeyColumns("CategoryID");
      
           Map<String, Object> parameters = new HashMap<String, Object>();
                   parameters.put("Category_Description", category);
			       parameters.put("Is_Active",'Y'); 
                   parameters.put("Create_Date",date);
                   parameters.put("Created_By", "Admin");

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
