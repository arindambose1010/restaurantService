package com.restaurant.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.restaurant.model.ServiceResponse;
import com.restaurant.model.TableDetails;
import com.restaurant.model.UserDTO;


@Component
public class TableMgntDaoImpl implements ITableMgntDao {

	
	private final Logger logger=Logger.getLogger(TableMgntDaoImpl.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	@Override
	public ServiceResponse getAllTable() {
		// TODO Auto-generated method stub
		ServiceResponse response=null;
		return response;
	}

	@Override
	public ServiceResponse getTableByRestaurant(String restaurantId) {
		TableDetails tdtl = new TableDetails();
		ServiceResponse response=new ServiceResponse();
		List<TableDetails> tabList=new ArrayList<TableDetails>();
		try {
		logger.info("restaurantId==" + restaurantId);
		String sql = "select Table_ID, Table_Number ,Is_Active ,Is_Occupied  from TABLE_MAST  where Restaurant_ID="+restaurantId;
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
           if(null !=rows) {
        logger.info("Size=="+rows.size());	   
		  for (Map<?, ?> row : rows) {
			  tdtl.setTableId(Integer.parseInt(row.get("Table_ID").toString()));
			  tdtl.setTableNo(row.get("Table_Number").toString());
			  tdtl.setStatus(row.get("Is_Occupied").toString());
			  tdtl.setIsActive(row.get("Is_Active").toString());
			  tabList.add(tdtl);
		  }
		  response.setStatus("Success");
          response.setResponseMessage("Data Found");
          response.setSearchCount(tabList.size());
          response.setResObject(tabList);
          }else {
           response.setStatus("Success");
           response.setResponseMessage("Data Not Found");
           response.setSearchCount(tabList.size());
           response.setResObject(null);
          }

		}catch(Exception e) {
			System.out.println("exeception=="+e.getMessage());
			e.printStackTrace();
		       response.setStatus("Fail");
	           response.setResponseMessage("Exception=="+e.getMessage());
	           response.setSearchCount(0);
	           response.setResObject(null);
		}
		return response;
	}
	
	
	
	
	
}
