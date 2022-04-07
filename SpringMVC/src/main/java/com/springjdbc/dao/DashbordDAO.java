package com.springjdbc.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springjdbc.Attendance;
import com.springjdbc.Invoice;
import com.springmvc.model.Summary;

@Repository
public class DashbordDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
		

	
	public Summary getSummary()throws Exception {
			List<Invoice> std=null;
			List<Attendance> at =null;
			Date d2 = new Date();
			double net=0;
			double net2=0;
			double ne = 0;
			double renew = 0;
			double one = 0;
			double due = 0;
			int c=0;
	        TimeZone.setDefault(TimeZone.getTimeZone("GMT+5:30"));
	        String dt = new SimpleDateFormat("yyyy-MM-dd").format(d2);
			String sql="SELECT * FROM invoice i WHERE i.date=?";
			String sql2="SELECT * FROM attendance WHERE date=?";
			RowMapper<Invoice> rowMapper=new RowMapperInvIOnlympl();
			RowMapper<Attendance> rowMapperAt=new RowMapperAttendanceImpl();
		try {
			
			std = this.jdbcTemplate.query(sql, rowMapper,dt);
			at = this.jdbcTemplate.query(sql2, rowMapperAt,dt);
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(std!=null) {
			for(Invoice inv:std) {
				net+=inv.getPayment();
				net2+=inv.getBalance();
				if(inv.getType().equals("New")) {
					ne+=(inv.getNettotal()-inv.getDueamount());
				}
				if(inv.getType().equals("Renewal")) {
					renew+=(inv.getNettotal()-inv.getDueamount());
				}
				if(inv.getType().equals("One Day")) {
					one+=(inv.getNettotal()-inv.getDueamount());
				}
				if(inv.getType().equals("Due pay")) {
					due+=(inv.getNettotal()-inv.getDueamount());
				}
			}
			if(at!=null) {
			for(Attendance a:at) {
				c++;
			}}
			Summary s =new Summary();
			s.setNetTotal(net-net2);
			s.setNewAdmission(ne);
			s.setRenewal(renew);
			s.setOneDay(one);
			s.setDueAmount(due);
			s.setMemberCount(c);
			return s;
		}else {
		
		
		
		return null;
		}
	}

}
