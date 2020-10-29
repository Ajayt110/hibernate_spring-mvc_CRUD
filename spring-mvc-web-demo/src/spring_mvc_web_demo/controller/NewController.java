package spring_mvc_web_demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewController {
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "input-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "process-form";
	}
	
	@RequestMapping("/newForm")
	public String modelTest(HttpServletRequest request, Model model)
	{
		String theName= request.getParameter("FormName");
		
		theName =theName.toUpperCase();
		
		String result= "Hi! , "+theName;
		
		model.addAttribute("message",result);
		
		return "process-form";
	}
	
	@RequestMapping("/newForm2")
	public String reqPar(@RequestParam("FormName") String theNameString , Model model)
	{
		theNameString = theNameString.toUpperCase();
		
		String result = "Yo Dude What up !!" + theNameString;
		
		model.addAttribute("message", result);
		
		return "process-form";
	}

}
