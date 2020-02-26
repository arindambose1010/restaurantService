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

import com.restaurant.model.RecipeDetails;
import com.restaurant.model.ServiceResponse;

@Component
public class RecipeMgntDaoImpl implements IRecipeMgntDao {

	private final Logger logger = Logger.getLogger(RecipeMgntDaoImpl.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public ServiceResponse addRecipe(RecipeDetails recipeDtl) {
		logger.info("******Recipe Management Dao Impl  *********");

		ServiceResponse response = new ServiceResponse();
		try {
			int flag0=0,flag = 0, flag2 = 0;
			Date date = new Date();
			int i = 1;

			SimpleJdbcInsert itemMastInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("item_mast")
					.usingGeneratedKeyColumns("itemid");

			Map<String, Object> parametersitem = new HashMap<String, Object>();
			parametersitem.put("ITEM_TYPE", recipeDtl.getMenuTypeId());
			parametersitem.put("item_description", recipeDtl.getDescription());
			parametersitem.put("Is_Active",'Y');
			parametersitem.put("Create_Date", date);
			parametersitem.put("Created_By", "Admin");
			parametersitem.put("Modify_Date", null);
			parametersitem.put("Modified_By", null);

			// execute insert
			Number key2 = null;
			try {
				key2 = itemMastInsert.executeAndReturnKey(new MapSqlParameterSource(parametersitem));
				itemMastInsert = null;
			} catch (Exception e) {
				throw new Exception(e.getMessage());
			}
			// set generated key
			flag0 = key2.intValue();
			
			if(flag0>0) {
			
			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("CATEGORY_ITEM_MAP")
					.usingGeneratedKeyColumns("CATEGORY_ITEM_MAP_ID");

			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("Category_ID", recipeDtl.getCategoryId());
			parameters.put("Item_ID", flag0);
			//parameters.put("Item_Description", recipeDtl.getDescription());
			parameters.put("Is_Active",'Y');
			parameters.put("Create_Date", date);
			parameters.put("Created_By", "Admin");
			parameters.put("Modify_Date", null);
			parameters.put("Modified_By", null);

			// execute insert
			Number key = null;
			try {
				key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
				jdbcInsert = null;
			} catch (Exception e) {
				throw new Exception(e.getMessage());
			}
			// set generated key
			flag = key.intValue();
			logger.info("*******flag******:"+flag);
			if (flag > 0) {
				SimpleJdbcInsert itemPriceInsert = new SimpleJdbcInsert(jdbcTemplate)
						.withTableName("CATEGORY_ITEM_PRICE").usingGeneratedKeyColumns("CATEGORY_ITEM_PRICE_ID");

				Map<String, Object> parameters1 = new HashMap<String, Object>();
				parameters1.put("Restaurant_ID", recipeDtl.getRestaurantId());
				parameters1.put("Category_Item_Map_ID", flag);
				parameters1.put("Price", recipeDtl.getPrice());
			    parameters1.put("Is_Active","Y");
				parameters1.put("Create_Date", date);
				parameters1.put("Created_By", "Admin");
				parameters1.put("Modify_Date", null);
				parameters1.put("Modified_By", null);

				Number key1 = null;
				try {
					key1 = itemPriceInsert.executeAndReturnKey(new MapSqlParameterSource(parameters1));
					itemPriceInsert = null;
				} catch (Exception e) {
					throw new Exception(e.getMessage());
				}
				// set generated key
				flag2 = key1.intValue();
             logger.info("******flag2****"+flag2);
			}
			}
			if (flag2 > 0) {
				response.setStatus("Success");
				response.setResponseMessage("Successfully Inserted");
				response.setResObject(null);
			} else {
				response.setStatus("Fail");
				response.setResponseMessage("Data not Inserted");
				response.setResObject(null);
			}

		} catch (Exception e) {
			logger.info("Execption----" + e.getMessage());
			response.setStatus("Fail");
			response.setResponseMessage("Exception--" + e.getMessage());
			response.setResObject(null);
		}

		return response;
	}

}
