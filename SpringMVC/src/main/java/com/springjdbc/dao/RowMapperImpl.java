package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.Client;


public class RowMapperImpl implements RowMapper<Client>{

	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		Client st=new Client();
		
		st.setCid(rs.getString(1));
		st.setName(rs.getString(2));
		st.setAddress(rs.getString(4));
		st.setGender(rs.getString(3));
		st.setTelephone(rs.getString(5));
		st.setMobile(rs.getString(6));
		st.setDateOfBirth(rs.getDate(7));
		st.setEmergencyContactp(rs.getString(8));
		st.setEmobile(rs.getString(9));
		st.setMedicalCondition(rs.getString(10));
		st.setWorkouttypeid(rs.getInt(11));
		st.setDate(rs.getDate(12));
		st.setImgurl(rs.getString(13));
		return st;
	}

}
