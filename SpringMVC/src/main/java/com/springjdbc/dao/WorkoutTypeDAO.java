package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springjdbc.Client;
import com.springjdbc.Workouttype;
@Repository
public class WorkoutTypeDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
		
	public List<Workouttype> getAllWorkoutType() {
		String sql="select * from workouttype";
		List<Workouttype> students = this.jdbcTemplate.query(sql,new RowMapperWorkoutImpl());
		return students;
	}
	
	public Workouttype getWorkoutType(String type) {
		String sql="select * from workouttype WHERE type=?";
		Workouttype students = this.jdbcTemplate.queryForObject(sql,new RowMapperWorkoutImpl(),type);
		return students;
	}

}
