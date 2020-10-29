package spring.webapplication.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.webapplication.dao.ServiceUser;
import spring.webapplication.dto.User;
import spring.webapplication.others.UserCheck;

@Controller
public class WebController {
	
	@RequestMapping("/contact")
	public String contactPageDisplay()
	{
		return "contact";
	}
	

	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@PostMapping("/register")
	public String registration(@ModelAttribute("user") User user, Model model) 
	{

		Map<String, String> errorMessages = UserCheck.validate(user);
		if (!errorMessages.isEmpty()) {
			model.addAttribute("errorMessages", errorMessages);
			return "register";
		}

		if (ServiceUser.save(user)) {
		
			return "redirect:/login";

		} else {
			model.addAttribute("errorMessage", "Internal Error Occured. Try again");
			return "register";
		}

	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			Model model) {

		User user = ServiceUser.get(email, password);
		if (user != null) {
			return "redirect:/home";
		} else {
			model.addAttribute("errorMessage", "Invalid Credentails");
			return "login";
		}
	}

	@GetMapping("/home")
	public String homePage() {
		return "home";
	}
}
