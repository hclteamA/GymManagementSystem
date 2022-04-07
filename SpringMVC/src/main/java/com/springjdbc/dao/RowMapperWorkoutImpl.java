package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.springjdbc.Workouttype;


public class RowMapperWorkoutImpl implements RowMapper<Workouttype>{

	public Workouttype mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Workouttype w =new Workouttype();
		w.setWorkouttypeid(rs.getInt("workouttypeid"));
		w.setType(rs.getString("type"));
		w.setPrice(rs.getDouble("price"));
		
		
		return w;
	}

}
