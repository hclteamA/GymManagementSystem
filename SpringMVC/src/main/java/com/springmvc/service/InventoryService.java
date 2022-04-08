package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc.Inventoryp;
import com.springjdbc.dao.InventoryDAO;

@Service
public class InventoryService {
	@Autowired
	private InventoryDAO inventoryDao;

	public int createInvp(Inventoryp invp) {
		return this.inventoryDao.insertInvp(invp);
		
		
	}
}