package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.Client;
import com.springjdbc.Invoice;


public class RowMapperInvImpl implements RowMapper<Invoice>{

	public Invoice mapRow(ResultSet rs, int rowNum) throws SQLException {
		Invoice st=new Invoice();
		
	st.setInv(rs.getString(1));
	st.setDate(rs.getDate(2));
	st.setDuedate(rs.getDate(3));
	st.setTime(rs.getTime(4));
	st.setNettotal(rs.getDouble(5));
	st.setPayment(rs.getDouble(6));
	st.setBalance(rs.getDouble(7));
	st.setCashier(rs.getString(8));
	st.setCid(rs.getString(9));
	st.setDueamount(rs.getDouble(10));
	st.setType(rs.getString(11));
	st.setRemarks(rs.getString(12));
	st.setInv(rs.getString(13));
		return st;
	}

}
