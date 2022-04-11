package com.groupproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.groupproject.beans.Attendance;
import com.groupproject.dao.AttendanceDAO;

@Controller
public class AttendanceController {

	@Autowired
	AttendanceDAO attendanceDAO;
	
	@RequestMapping("/attendance")
	public String showForm(Model model) {
		model.addAttribute("command", new Attendance());
		return "attendance-form";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("attendance") Attendance attendance) {
		attendanceDAO.save(attendance);
		return "redirect:/attendance";
	}
	
	@RequestMapping("/list-attendance")
	public String viewAttendance(Model model) {
		List<Attendance> list = attendanceDAO.getAttendance();
		model.addAttribute("list", list);
		return "list-attendance";
	}
}
