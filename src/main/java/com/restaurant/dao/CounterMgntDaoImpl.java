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

import com.restaurant.model.CloseCounter;
import com.restaurant.model.OpenCounterDetails;
import com.restaurant.model.ServiceResponse;

@Component
public class CounterMgntDaoImpl implements ICounterMgntDao {

	private final Logger logger = Logger.getLogger(CounterMgntDaoImpl.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public ServiceResponse addOpenCounterDetails(OpenCounterDetails openCounterDetails) {
		logger.info("******addOpenCounterDetails Dao Impl  *********");

		ServiceResponse response = new ServiceResponse();
		try {
			int flag = 0;
			Date date = new Date();

			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("CASH_COUNTER")
					.usingGeneratedKeyColumns("Counter_ID");

			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("Restaurant_ID", openCounterDetails.getRestaurant());
			parameters.put("Business_Date", openCounterDetails.getDate());
			parameters.put("Opening_Balance", openCounterDetails.getOpeningBal());
			parameters.put("Status", "Open");
			parameters.put("Create_Date", date);
			parameters.put("Created_By", "Admin");
			parameters.put("Modify_Date", null);
			parameters.put("Modified_By", null);

			// execute insert
			Number key = null;
			try {
				key = jdbcInsert.execute(new MapSqlParameterSource(parameters));
				jdbcInsert = null;
			} catch (Exception e) {
				throw new Exception(e.getMessage());
			}
			// set generated key
			flag = key.intValue();
			if (flag > 0) {
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

	@Override
	public ServiceResponse addCloseCounter(CloseCounter closeCounterDetails) {
		// TODO Auto-generated method stub
		return null;
	}

}
