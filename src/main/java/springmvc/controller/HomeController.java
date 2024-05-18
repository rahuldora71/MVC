package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","Rahul Dora");
		model.addAttribute("id",1520);
		List<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Manoj");
		list.add("Durgash");
		list.add("Rohit");
		list.add("Sumit");
		list.add("Shubam");
		model.addAttribute("list",list);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is About Controler");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help Controler");
		//creating model and view 
		
		ModelAndView modelAndView=new ModelAndView();
		//Setting Data
		modelAndView.addObject("name","Dipanshu");
		//Setting View name
		modelAndView.setViewName("help");
		List<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Manoj");
		list.add("Durgash");
		list.add("Rohit");
		list.add("Sumit");
		list.add("Shubam");
		modelAndView.addObject("list1",list);
		return modelAndView;
	}

	
}
