package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc.Invoice;
import com.springjdbc.dao.InvoiceDAO;

@Service
public class InvoiceService {

	@Autowired
	InvoiceDAO invoiceDAO;
	public List<Invoice>  getInvoiceByID(String id) throws Exception {
		return invoiceDAO.getInvoiceByID(id);
	}
	
	public List<Invoice>  getAllInvoice() throws Exception {
		return invoiceDAO.getAllInvoice();
		
	}
	
	public int insertInvoice(Invoice i)  throws Exception {
		
		return invoiceDAO.insertInvoice(i);
		
	}
}
