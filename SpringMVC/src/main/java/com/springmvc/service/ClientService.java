package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc.Client;
import com.springjdbc.dao.ClientDAO;
@Service
public class ClientService {

	@Autowired
	private ClientDAO clientDAO;
	
	public Client getClient(String sId) {
		return clientDAO.getClient(sId);
	}
}
