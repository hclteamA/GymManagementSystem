package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springjdbc.Client;
@Repository
public class ClientDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
		

	public Client getClient(String sId) {
		Client c=null;
		String sql="select * from client where cid=?";
		RowMapper<Client> rowMapper=new RowMapperImpl();
		try {
			c = this.jdbcTemplate.queryForObject(sql, rowMapper,sId);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return c;
	}
	public List<Client> getAllClients() {
		String sql="select * from client";
		List<Client> students = this.jdbcTemplate.query(sql,new RowMapperImpl());
		return students;
	}

}
