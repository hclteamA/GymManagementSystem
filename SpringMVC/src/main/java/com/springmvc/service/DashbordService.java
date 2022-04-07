package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc.dao.DashbordDAO;
import com.springmvc.model.Summary;

@Service
public class DashbordService {
	
	@Autowired
	private DashbordDAO dashbordDAO;
public Summary getSummary() throws Exception {
		
		return this.dashbordDAO.getSummary();
	}
}
