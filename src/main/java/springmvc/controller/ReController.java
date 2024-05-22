package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	
	
	//Redirect using redirect prefix
	
//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("This is one handler");
//		return"redirect:/enjoy";
//	}
//	@RequestMapping("/enjoy")
//	public String two() {		
//		System.out.println("This is enjoy handler");
//
//		return"contact";
//		
//	}
	
	//Redirect using RedirectView Class
	
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is one handler");
		RedirectView view=new RedirectView();
		view.setUrl("enjoy");
		return view;
	}
	@RequestMapping("/enjoy")
	public String two() {		
		System.out.println("This is enjoy handler");

		return"contact";
		
	}

}
