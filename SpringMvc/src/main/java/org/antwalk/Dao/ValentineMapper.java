package org.antwalk.Dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.antwalk.model.Valentine;
import org.springframework.jdbc.core.RowMapper;

public class ValentineMapper implements RowMapper<Valentine> {

	@Override
	public Valentine mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
