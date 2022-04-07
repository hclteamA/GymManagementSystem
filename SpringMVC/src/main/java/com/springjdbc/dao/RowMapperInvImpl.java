package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.Client;
import com.springjdbc.Invoice;
import com.springjdbc.Workouttype;


public class RowMapperInvImpl implements RowMapper<Invoice>{

	public Invoice mapRow(ResultSet rs, int rowNum) throws SQLException {
		Invoice st=new Invoice();
		Client c =new Client();
		c.setCid(rs.getString("c.cid"));
		c.setName(rs.getString("c.name"));
		c.setAddress(rs.getString("c.address"));
		c.setGender(rs.getString("c.gender"));
		c.setTelephone(rs.getString("c.telephone"));
		c.setMobile(rs.getString("c.mobile"));
		c.setDateOfBirth(rs.getDate("c.date_of_birth"));
		c.setEmergencyContactp(rs.getString("c.emergency_contactp"));
		c.setEmobile(rs.getString("c.emobile"));
		c.setMedicalCondition(rs.getString("c.medical_condition"));
		c.setWorkouttypeid(rs.getInt("c.workouttypeid"));
		c.setDate(rs.getDate("c.date"));
		c.setImgurl(rs.getString("c.imgurl"));
		
		Workouttype w =new Workouttype();
		w.setWorkouttypeid(rs.getInt("w.workouttypeid"));
		w.setType(rs.getString("w.type"));
		w.setPrice(rs.getDouble("w.price"));
		
		c.setWorkouttypeByWorkouttypeid(w);
		
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
	st.setClientByCid(c);
		return st;
	}

}
