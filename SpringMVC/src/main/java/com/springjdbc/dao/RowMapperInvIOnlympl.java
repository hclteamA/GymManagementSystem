package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.springjdbc.Invoice;



public class RowMapperInvIOnlympl implements RowMapper<Invoice>{

	public Invoice mapRow(ResultSet rs, int rowNum) throws SQLException {
		Invoice st=new Invoice();
		
	st.setInvoiceid(rs.getString("i.invoiceid"));
	st.setDate(rs.getDate("i.date"));
	st.setDuedate(rs.getDate("i.duedate"));
	st.setTime(rs.getTime("i.time"));
	st.setNettotal(rs.getDouble("i.nettotal"));
	st.setPayment(rs.getDouble("i.payment"));
	st.setBalance(rs.getDouble("i.balance"));
	st.setCashier(rs.getString("i.cashier"));
	st.setCid(rs.getString("i.cid"));
	st.setDueamount(rs.getDouble("i.dueamount"));
	st.setType(rs.getString("i.type"));
	st.setRemarks(rs.getString("i.remarks"));
	st.setInv(rs.getString("i.inv"));
	
		return st;
	}

}
