package spring_mvc_web_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Spring_controller {
	
	@RequestMapping("/")
	public String showPage()
	{
		return "homepage";
	}

}
