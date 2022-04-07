package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.Attendance;
import com.springjdbc.Client;


public class RowMapperAttendanceImpl implements RowMapper<Attendance>{

	public Attendance mapRow(ResultSet rs, int rowNum) throws SQLException {
		Attendance st=new Attendance();
		st.setDate(rs.getDate(1));
		st.setIntime(rs.getTime(2));
		st.setCid(rs.getString(4));
		st.setStatus(rs.getInt(3));
		return st;
	}

}
