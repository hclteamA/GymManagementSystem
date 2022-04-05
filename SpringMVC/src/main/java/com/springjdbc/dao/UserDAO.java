package com.springjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.springjdbc.User;
import com.springmvc.model.My_Encrypt;


@Repository
public class UserDAO {
@Autowired
	private JdbcTemplate jdbcTemplate;
public User getUser(User u) throws Exception {
	User std=null;
	String encrypt = My_Encrypt.encrypt(u.getPassword());
	String sql="SELECT * FROM user u INNER JOIN usertype ut ON u.usertypeid=ut.usertypeid INNER JOIN userdata ud ON u.id=ud.id  WHERE username=? AND password=? ";
	RowMapper<User> rowMapper=new RowMapperUserImpl();
try {
	
	std = this.jdbcTemplate.queryForObject(sql, rowMapper,u.getUsername(),encrypt);
		
}catch(Exception e) {
	e.printStackTrace();
}
	
	
	return std;
}
public User getUserByemail(User u) throws Exception {
	User std=null;
	String sql="SELECT * FROM user u INNER JOIN usertype ut ON u.usertypeid=ut.usertypeid INNER JOIN userdata ud ON u.id=ud.id  WHERE username=?";
	RowMapper<User> rowMapper=new RowMapperUserImpl();
try {
	
	std = this.jdbcTemplate.queryForObject(sql, rowMapper,u.getUsername());
		
}catch(Exception e) {
	e.printStackTrace();
}
	
	
	return std;
}

public int setUser(User u) throws Exception {
	User std=null;
	String encrypt = My_Encrypt.encrypt(u.getPassword());
	String sql="SELECT * FROM user u INNER JOIN usertype ut ON u.usertypeid=ut.usertypeid INNER JOIN userdata ud ON u.id=ud.id  WHERE username=? AND password=? ";
	RowMapper<User> rowMapper=new RowMapperUserImpl();
try {
	
	std = this.jdbcTemplate.queryForObject(sql, rowMapper,u.getUsername(),encrypt);
		
}catch(Exception e) {
	e.printStackTrace();
}
int i=0;
if(std==null) {
	String query="insert into userdata(name) values(?)";
	int r=this.jdbcTemplate.update(query,u.getUserdataById().getName());
	String query2="INSERT INTO user(username ,password,usertypeid,id,approve) VALUES(?,?,?,(SELECT id FROM userdata WHERE name=?),?)";
	int r2=this.jdbcTemplate.update(query2,u.getUsername(),encrypt,2,u.getUserdataById().getName(),0);
	i= r2;
}
	
	return i;
	
}





public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
	

}
