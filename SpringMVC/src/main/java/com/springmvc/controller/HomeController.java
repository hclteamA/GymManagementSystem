package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springjdbc.Client;
import com.springjdbc.Invoice;
import com.springjdbc.User;
import com.springjdbc.Userdata;
import com.springjdbc.Usertype;
import com.springjdbc.dao.StudentDao;
import com.springmvc.model.UserM;
import com.springmvc.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/profile")
	public String profile() {

	    return "profile";
	}
	@RequestMapping("/pos")
	public String pos() {

	    return "pos";
	}
	@RequestMapping("/index")
	public String index() {

	    return "index";
	}
	@RequestMapping("/login")
	public String login() {

	    return "login";
	}
	@RequestMapping("/register")
	public String register() {
	    return "register";
	}
	
	@RequestMapping(path="/registerUser",method = RequestMethod.POST)
	public String registerUser(@RequestParam("flast_name")String name,@RequestParam("email")String email,@RequestParam("password")String pw,Model model) throws Exception {
		System.out.println(name);
		User u =new User();
		Usertype ut =new Usertype();
		Userdata ud =new Userdata();
		ud.setName(name);
		ut.setUsertypeid(2);
		ut.setUsertype("User");
		u.setUsername(email);
		u.setPassword(pw);
		u.setUsertypeByUsertypeid(ut);
		u.setUsertypeid(2);
		u.setUserdataById(ud);
		User exist=	this.userService.getUserByemail(u);
		if(exist!=null) {
			model.addAttribute("msg1","Username Already Taken");
			  return "register";
		}else {
			int e=this.userService.setUser(u);
			if(e==1) {
				 return "login";
				
			}else {
		   return "register";
			}
		}
		
	}
	
	@RequestMapping(path="/usercheck",method = RequestMethod.POST)
	public String userCheck(@ModelAttribute("user")UserM user,Model model) throws Exception {
		User u =new User();
		u.setUsername(user.getEmail());
		u.setPassword(user.getPassword());
	User exist=	this.userService.getUser(u);
	if(exist!=null) {
		if(exist.getApprove()==1) {
			return "index";
		}else {
			model.addAttribute("msg1","User Not Approved!");
			
				    return "login";
		}
		
	}else {
	
model.addAttribute("msg1","Invalid UserName");
model.addAttribute("msg2","Invalid Password");
	    return "login";
	}
	}
	
	
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
	    	  
	       
	       
//		model.addAttribute("name", "Charshini");
//		model.addAttribute("Id",2426);
//		List<String> names=new ArrayList<String>();
//		names.add("Husmitha");
//		names.add("MAdhubashini");
//		names.add("Abirami");
//		names.add("Karthik");
//		model.addAttribute("n",names);
		
		System.out.println("Home page called....");
		return "login";
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
