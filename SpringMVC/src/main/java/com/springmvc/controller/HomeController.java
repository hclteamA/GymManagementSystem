package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springjdbc.Client;
import com.springjdbc.Invoice;
import com.springjdbc.dao.StudentDao;

@Controller
public class HomeController {
	 
	
	@RequestMapping("/")
	public String home(Model model)
	{
		 ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	      StudentDao stdDao = context.getBean("stdDao",StudentDao.class);
//	      List<Client> allStudents = stdDao.getAllStudents();
//	       for(Client s:allStudents) {
//	    	   System.out.println(s);
//	       }
	       
	       Invoice allStudents = stdDao.getInvoice("INV200");
	      if(allStudents!=null) {
	    	  System.out.println("inv "+allStudents.getCid()+" "+allStudents.getDate());
	      }
	    	  
	       
	       
		model.addAttribute("name", "Charshini");
		model.addAttribute("Id",2426);
		List<String> names=new ArrayList<String>();
		names.add("Husmitha");
		names.add("MAdhubashini");
		names.add("Abirami");
		names.add("Karthik");
		model.addAttribute("n",names);
		
		System.out.println("Home page called....");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		
		System.out.println("About page called....");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		
		System.out.println("From help page.....");
		ModelAndView model=new ModelAndView();
		//set the data
		model.addObject("name","Himasha");
		model.addObject("id",3456);
		
		model.setViewName("help");
		
		return model;
		
		
	}


}
