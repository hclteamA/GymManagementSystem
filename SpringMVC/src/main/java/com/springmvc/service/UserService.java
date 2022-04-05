package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc.User;
import com.springjdbc.dao.UserDAO;
import com.springmvc.model.UserM;

@Service
public class UserService {
	@Autowired
	private UserDAO userDao;
	
public User getUser(User u) throws Exception {
	
	return userDao.getUser(u);
}

public int setUser(User u) throws Exception {
	
	return userDao.setUser(u);
}

public User getUserByemail(User u) throws Exception {
	return userDao.getUserByemail(u);
}
}
