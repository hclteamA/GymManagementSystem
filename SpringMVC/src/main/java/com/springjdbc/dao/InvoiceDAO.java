package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springjdbc.Invoice;
import com.springjdbc.User;
@Repository
public class InvoiceDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
		
	public List<Invoice>  getInvoiceByID(String id) throws Exception {
		List<Invoice> std=null;
		String sql="SELECT * FROM invoice i INNER JOIN client c ON i.cid=c.cid INNER JOIN workouttype w ON c.workouttypeid=w.workouttypeid WHERE i.cid=? ORDER BY i.date DESC,i.time DESC";
		RowMapper<Invoice> rowMapper=new RowMapperInvImpl();
	try {
		
		std = this.jdbcTemplate.query(sql, rowMapper,id);
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		
		return std;
	}
	
}
