package com.ecom;

import org.springframework.web.bind.annotation.RequestMapping;

public class PageController {
	@RequestMapping("/login")
	public String showLoginPage()
	{
		return "Login";
	}
	
	@RequestMapping("/register")
	public String showRegisterPage()
	{
		return "Register";
	}
}
