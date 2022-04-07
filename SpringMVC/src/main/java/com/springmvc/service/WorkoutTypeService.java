package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc.Client;
import com.springjdbc.Workouttype;
import com.springjdbc.dao.ClientDAO;
import com.springjdbc.dao.WorkoutTypeDAO;
@Service
public class WorkoutTypeService {

	@Autowired
	private WorkoutTypeDAO workoutTypeDAO;
	
	public List<Workouttype> getAllWorkoutType() {
		return workoutTypeDAO.getAllWorkoutType();
	}
	
	public Workouttype getWorkoutType(String type) {
		return workoutTypeDAO.getWorkoutType(type);
	}
}
