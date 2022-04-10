package com.springjdbc.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springjdbc.Client;
import com.springmvc.model.User1;
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
		String sql="select * from client c INNER JOIN workouttype w ON c.workouttypeid=w.workouttypeid where cid=?";
		RowMapper<Client> rowMapper=new RowMapperImpl();
		try {
			c = this.jdbcTemplate.queryForObject(sql, rowMapper,sId);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return c;
	}
	public List<Client> getAllClients() {
		String sql="select * from client c INNER JOIN workouttype w ON c.workouttypeid=w.workouttypeid";
		List<Client> students = this.jdbcTemplate.query(sql,new RowMapperImpl());
		return students;
	}
	public List<Client> getLastClient() {
		String sql="SELECT * FROM client c INNER JOIN workouttype w ON c.workouttypeid=w.workouttypeid ORDER BY cid +0 DESC";
		List<Client> students = this.jdbcTemplate.query(sql,new RowMapperImpl());
		return students;
	}
	
public int addUser(User1 user) {
	Date d2 = new Date();
    TimeZone.setDefault(TimeZone.getTimeZone("GMT+5:30"));
    String dot = new SimpleDateFormat("yyyy-MM-dd").format(d2);
		String sql="insert into client values(?,?,?,?,?,?,?,?,?,?,(SELECT workouttypeid FROM workouttype WHERE type=?),?,?)";
		
		int r = this.jdbcTemplate.update(sql,user.getmId(),user.getFname()+" "+user.getLname(),user.getGender(),user.getAddress(),"",user.getMobile(),null,user.getEmbp(),user.getEmbpm(),user.getMedical(),user.getPack(),dot,null);
		System.out.println("Record inserted.....");
		
		return r;
	}


}
