package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc.Client;
import com.springjdbc.dao.ClientDAO;
import com.springmvc.model.User1;
@Service
public class ClientService {

	@Autowired
	private ClientDAO clientDAO;
	
	public Client getClient(String sId) {
		return clientDAO.getClient(sId);
	}
	
	public int createUser(User1 user) {
		return this.clientDAO.addUser(user);
		 
	}
	public List<Client> getLastClient() {
		return this.clientDAO.getLastClient();
	}
}
