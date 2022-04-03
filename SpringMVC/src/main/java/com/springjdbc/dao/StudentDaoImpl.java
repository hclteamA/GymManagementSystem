package com.springjdbc.dao;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.Client;
import com.springjdbc.Invoice;
import com.springjdbc.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		
		String query="insert into student values(?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getSid(),student.getCity(),student.getName());
		
		return r;
	}

	public int change(Student st) {
		String query="update student set city=?,name=? where sid=?";
		
		int r = this.jdbcTemplate.update(query,st.getCity(),st.getName(),st.getSid());
		return r;
	}

//	public int delete(int stdId) {
//		String query = "delete from student where sid=?";
//		int r = this.jdbcTemplate.update(query,stdId);
//		return r;
//	}

	public Client getStudent(int sId) {
		String sql="select * from client where cid=?";
		RowMapper<Client> rowMapper=new RowMapperImpl();
		Client std = this.jdbcTemplate.queryForObject(sql, rowMapper,sId);
		
		
		return std;
	}
	public Invoice getInvoice(String inv) {
		String sql="select * from invoice where invoiceid=?";
		RowMapper<Invoice> rowMapper=new RowMapperInvImpl();
		Invoice std = this.jdbcTemplate.queryForObject(sql, rowMapper,inv);
		
		
		return std;
	}

	public List<Client> getAllStudents() {
		String sql="select * from client";
		List<Client> students = this.jdbcTemplate.query(sql,new RowMapperImpl());
		return students;
	}

	public int delete(int stdId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Client> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}



	

	
}
