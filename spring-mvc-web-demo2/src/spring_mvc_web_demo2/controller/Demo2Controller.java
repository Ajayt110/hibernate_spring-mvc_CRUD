package spring_mvc_web_demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo2Controller {
	
	@RequestMapping("/")
	public String pageDisplay()
	{
		return "homePage";
	}
	
	@RequestMapping("/studentForm")
	public String studentDetailsForm(Model model)
	{
		Student theStudent= new Student();
		
		model.addAttribute("student", theStudent);
		
		return "studentForm";
	}
	
	@RequestMapping("/displayDetails")
	public String displayDetails(@ModelAttribute("student") Student theStudent)
	{
		System.out.println("The Student "+ theStudent.getFirstName() + " " + theStudent.getLastName());
		
		return "displayDetails";
	}
}
