package spring_mvc_web_demo3_validations.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		 
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/")
	public String homePageDisplay()
	{
		return "home-page";
	}

	@RequestMapping("/customerForm")
	public String formPageDisplay(Model model)
	{
		Customer customer = new Customer();
		
		model.addAttribute("customer", customer);
		
		return "customer-form";
	}
	
	@RequestMapping("/customerDetails")
	public String finalPageDisplay(@Valid @ModelAttribute("customer") Customer theCustomer , BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
			return "customer-form";
		else
			return "customer-details";
	}
}
