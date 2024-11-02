package com.example.securitymaual;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AbhiController {
	
		
	 @GetMapping("/UserDetails")
	    public String showLoginForm() {
	        return "UserDetails";
	
	
	}
}
