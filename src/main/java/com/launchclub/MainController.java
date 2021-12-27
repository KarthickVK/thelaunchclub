package com.launchclub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping("/register")
	public String showForm(Model model) {
		Register register=new Register();
		model.addAttribute("Register", register);
		return "register_form";
	}
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("Register")Register register) {
		System.out.println(register);
		return "register_success";
	}
	 @GetMapping("/login") 
	 public String loginform(Model model1) 
	 { 	
		 Login login=new Login();
		 model1.addAttribute("Login",login);
		 return "login_form";
		 }
	 @PostMapping("/login")
		public String submitForm(@ModelAttribute("Login")Login login) {
			System.out.println(login);
			return "login_success";
	
	 }
}
