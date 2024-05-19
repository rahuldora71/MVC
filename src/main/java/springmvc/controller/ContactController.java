package springmvc.controller;

//import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
//import springmvc.service.UserService;

@Controller

public class ContactController {
//	@Autowired
//	private UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("dora","Hi Rahul Dora");
		m.addAttribute("des","This is spring MVC tutorial");
		System.out.println("Adding common data to model...........");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("This is contact");
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleform(@ModelAttribute User user,Model m) {
		
		System.out.println("This is Process Form");
//		this.userService.create(user); 
		System.out.println(user);
		return "success";
	}
	

	
	
	/*
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleform(
			@RequestParam("email")String email,
			@RequestParam("userName")String userName,
			@RequestParam("password")String password,
			Model model) {
		
		System.out.println("This is Process Form");
		
		//Old method 
//		String email = (String) request.getParameter("email");
//		String userName = (String) request.getParameter("userName");
//		String password = (String) request.getParameter("password");
		
		
//		 Process start's
		
		User user=new User(email,userName,password);
		
		System.out.println(user);
		
//		  Process end's 
		
		//after process
//		model.addAttribute("userName",userName);
//		model.addAttribute("email",email);
//		model.addAttribute("password",password);
		
		model.addAttribute("user",user);
		
		return "success";
	}
	*/

}
