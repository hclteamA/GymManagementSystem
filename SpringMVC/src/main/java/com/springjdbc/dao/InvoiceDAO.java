package com.springjdbc.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.springjdbc.Invoice;
import com.springjdbc.Invoiceitem;
import com.springjdbc.Workouttype;
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
	
	public List<Invoice>  getAllInvoice() throws Exception {
		List<Invoice> std=null;
		String sql="SELECT * FROM invoice i ORDER BY i.date DESC,i.time DESC";
		RowMapper<Invoice> rowMapper=new RowMapperInvIOnlympl();
	try {
		
		std = this.jdbcTemplate.query(sql, rowMapper);
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		
		return std;
	}
	
	
	
	public int insertInvoice(Invoice iv) {
		
		List<Invoiceitem> it=iv.getInvoiceitemsByInvoiceid();
		String type=it.get(0).getWorkouttypeByWorkouttypeid().getType();
		 String ddate;
         Date duecal = null;
        
        	 Date d2 = new Date();
             TimeZone.setDefault(TimeZone.getTimeZone("GMT+5:30"));
             String date2 = new SimpleDateFormat("yyyy-MM-dd").format(d2);
           
if(iv.getDuedate()!=null) {
           
                 duecal =iv.getDuedate();
             } else {
                 Date d5 = new Date();
                 TimeZone.setDefault(TimeZone.getTimeZone("GMT+5:30"));
                 duecal = d5;
                 d5 = null;
             }

             switch (type) {
                 case "03 Months Weight": {
                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 3);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "03 Months Weight(new)": {
                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 3);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "03 Months Weigh&Cardio": {
                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 3);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "03 Months Weigh&Cardio(new)": {
                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 3);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "06 Months Weight": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 6);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "06 Months Weight(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 6);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "06 Months Weigh&Cardio": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 6);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "06 Months Weigh&Cardio(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 6);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "12 Months Weight": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.YEAR, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "12 Months Weight(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.YEAR, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "12 Months Weigh&Cardio": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.YEAR, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "12 Months Weigh&Cardio(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.YEAR, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weight": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weight(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weight & Cardio": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weight & Cardio(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weight & Aerobic": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weight & Aerobic(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weight & Cardio & Aerobic": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weight & Cardio & Aerobic(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Aerobic": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Aerobic(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Couple": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Couple(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Zumba": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Zumba(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Zumba DSPY": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Zumba DSPY(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "One Month Weight": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "One Month Weight & Cardio": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Off Peak Weight": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Off Peak Weight(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Off Peak Weight & Cardio": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Off Peak Weight & Cardio(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weekend Only": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weekend Only(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weekend Weight & Cardio Only": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "Weekend Weight & Cardio Only(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "One Month Foreigner": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.MONTH, 1);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "One week": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.DATE, 7);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "One week(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.DATE, 7);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "One week Weight & Cardio": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.DATE, 7);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 case "One week Weight & Cardio(new)": {

                     Calendar c = Calendar.getInstance();
                     c.setTime(duecal);
                     c.add(Calendar.DATE, 7);
                     ddate = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

                     break;
                 }
                 default:
                     ddate = date2;
                     break;
             }
		
             try {
		String query="INSERT INTO invoice VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		this.jdbcTemplate.update(query,iv.getInvoiceid(),date2,ddate,iv.getTime(),iv.getNettotal(),iv.getPayment(),iv.getBalance(),iv.getCashier(),iv.getCid(),iv.getDueamount(),iv.getType(),iv.getRemarks(),iv.getInv());
		String query2="INSERT INTO invoiceitem (invoiceid,total,discount,workouttypeid) VALUES(?,?,?,?)";
		for(Invoiceitem invt:it) {
			this.jdbcTemplate.update(query2,invt.getInvoiceid(),invt.getTotal(),invt.getDiscount(),invt.getWorkouttypeid());
	}
	
             }catch(Exception e) {
            	 e.printStackTrace();
             }
		
	
		return 0;
		
		
		
     
		
	}
	
}
