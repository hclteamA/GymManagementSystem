package com.springjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springjdbc.Inventoryp;

@Repository
public class InventoryDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public int insertInvp(Inventoryp invp) {
		String sql = "insert into Inventoryp values(?,?,Suppliment)";
		int r =this.jdbcTemplate.update(sql, invp.getId(), invp.getName());
		System.out.println("user inserted successfully....");
		
		return r;
		
	}
}
