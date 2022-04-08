package com.springmvc.controller;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springjdbc.Client;
import com.springjdbc.Inventoryp;
import com.springjdbc.Invoice;
import com.springjdbc.Invoiceitem;
import com.springjdbc.User;
import com.springjdbc.Userdata;
import com.springjdbc.Usertype;
import com.springjdbc.Workouttype;
import com.springjdbc.dao.StudentDao;
import com.springmvc.model.Inv;
import com.springmvc.model.Summary;
import com.springmvc.model.UserM;
import com.springmvc.service.ClientService;
import com.springmvc.service.DashbordService;
import com.springmvc.service.InventoryService;
import com.springmvc.service.InvoiceService;
import com.springmvc.service.UserService;
import com.springmvc.service.WorkoutTypeService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	@Autowired
	private DashbordService dashbordService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private InvoiceService invoiceService;
	@Autowired
	private WorkoutTypeService workoutTypeService;
	@Autowired
	private InventoryService inventoryService;
	
	
	//inventory controller handlers
	@RequestMapping("/inventory")
	public String showInventory() {
		return "";
	}
	
	//inventory add product
		@RequestMapping(path="/processform",  method=RequestMethod.POST)
		public String handleForm(@ModelAttribute("user") Inventoryp invp, Model model) {
			
			
			int createuser = this.inventoryService.createInvp(invp);
			
				model.addAttribute("msg", "user created successfulyy"+ createuser);
				return "";
			
		}
	
	@RequestMapping("/profile")
	public String profile() {

	    return "profile";
	}
	@RequestMapping("/pos")
	public String pos(Model model) throws Exception {
		List<Invoice>  i=invoiceService.getAllInvoice();
		 if (i!=null) {
             int id = Integer.parseInt(i.get(0).getInvoiceid().substring(3));
             String i1 = String.valueOf(id + 1);
             model.addAttribute("invid","INV" + i1);
            
         } else {
        	 model.addAttribute("invid","INV1");
            
         }

	    return "pos";
	}
	
	@PostMapping("/checkClient")
	@ResponseBody
	public String checkClient(@RequestParam("id") String id) throws Exception {
		List<Invoice>  i=invoiceService.getInvoiceByID(id);
		Client c=clientService.getClient(id);
		List<Workouttype> w=workoutTypeService.getAllWorkoutType();
		System.out.println(i);
		String dot="";
		String due="";
		String pack="";
		double price=0;
		String packM="";	
		double priceM=0;
		String joinDate="";
		if(!i.isEmpty()) {
			dot = new SimpleDateFormat("yyyy-MM-dd").format(i.get(0).getDuedate());

		}
		if(c!=null) {
			due=c.getName();
			pack=c.getWorkouttypeByWorkouttypeid().getType();
			price=c.getWorkouttypeByWorkouttypeid().getPrice();
			joinDate=new SimpleDateFormat("yyyy-MM-dd").format(c.getDate());
		}
		
		if(!w.isEmpty()) {
			for(Workouttype wt:w) {
				if(wt.getType().equals("MembershipFee")) {
					packM=wt.getType();
					priceM=wt.getPrice();
				}
			}

		}
		
		return due+","+dot+","+pack+","+price+","+packM+","+priceM+","+joinDate;
		
		
	   
	}
//	@PostMapping("/workoutType")
//	@ResponseBody
//	public String workoutType() throws Exception {
//		List<Workouttype>  i=workoutTypeService.getAllWorkoutType();
//	
//		String pack="";
//		
//		double price=0;
//		if(!i.isEmpty()) {
//			for(Workouttype w:i) {
//				if(w.getType().equals("MembershipFee")) {
//					pack=w.getType();
//					price=w.getPrice();
//				}
//			}
//
//		}
//		
//		
//		
//		
//		return pack+","+price;
//		
//		
//	   
//	}
	
	@RequestMapping("/index")
	public String index(Model model) throws Exception {
Summary s =dashbordService.getSummary();
if(s!=null) {
model.addAttribute("net",s.getNetTotal());
model.addAttribute("renew",s.getRenewal());
model.addAttribute("due",s.getDueAmount());
model.addAttribute("one",s.getOneDay());
model.addAttribute("atten",s.getMemberCount());
model.addAttribute("newM",s.getNewAdmission());
}
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
			return "redirect:/index";
			
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
	@RequestMapping(path="/payment",method = RequestMethod.POST)
	public String payment(
	@RequestParam("mid")String mid,
	@RequestParam("name")String name,
	@RequestParam("st")String st,
	@RequestParam("invi")String inv,
	@RequestParam("duedate")String duedate,
	@RequestParam("package")String packageM,
	@RequestParam("price")String price,
	@RequestParam("dis")String dis,
	@RequestParam("nettot")String nettot,
	@RequestParam("payment")String payment,
	@RequestParam("balance")String balance,
	@RequestParam("dueamount")String dueamount,Model model) throws Exception {
	Workouttype w1=	workoutTypeService.getWorkoutType(packageM);
	Workouttype w2=	workoutTypeService.getWorkoutType("MembershipFee");
	Client c=clientService.getClient(mid);
		Invoiceitem item =new Invoiceitem();
		item.setInvoiceid(inv);
		item.setWorkouttypeByWorkouttypeid(w1);
		item.setWorkouttypeid(w1.getWorkouttypeid());
		item.setTotal(Double.parseDouble(price));
		item.setDiscount(Double.parseDouble(dis));
		item.setInvoiceByInvoiceid(null);
		
		Invoiceitem newMember =new Invoiceitem();
		newMember.setInvoiceid(inv);
		newMember.setWorkouttypeByWorkouttypeid(w2);
		newMember.setWorkouttypeid(w2.getWorkouttypeid());
		newMember.setTotal(w2.getPrice());
		newMember.setDiscount(0.0);
		newMember.setInvoiceByInvoiceid(null);
		Date d2 = new Date();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+5:30"));
        String dot = new SimpleDateFormat("yyyy-MM-dd").format(d2);
        long now = System.currentTimeMillis();
        Time sqlTime = new Time(now);
		//dot = new SimpleDateFormat("yyyy-MM-dd").format(i.get(0).getDuedate());
		final java.sql.Date sqlDate=  java.sql.Date.valueOf(dot);
		Invoice invoice= new Invoice();
		invoice.setInvoiceid(inv);
		invoice.setBalance(Double.parseDouble(balance));
		invoice.setCashier("");
		invoice.setCid(mid);
		invoice.setClientByCid(c);
		invoice.setDate(sqlDate);
		invoice.setDueamount(Double.parseDouble(dueamount));
		invoice.setInv("");
		invoice.setNettotal(Double.parseDouble(nettot));
		invoice.setPayment(Double.parseDouble(payment));
		invoice.setTime(sqlTime);
		invoice.setType(st);
		invoice.setRemarks("");
		List<Invoiceitem> it =new ArrayList<Invoiceitem>();
		
		if(invoice.getType().equals("New")) {
			it.add(item);
			it.add(newMember);
		}else {
			it.add(item);
		}
		invoice.setInvoiceitemsByInvoiceid(it);
		
		invoiceService.insertInvoice(invoice);
		
		return "redirect:/pos";
		
		
		
	}
	
	@RequestMapping("/")
	public String home(Model model)
	{
		
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
