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
}
