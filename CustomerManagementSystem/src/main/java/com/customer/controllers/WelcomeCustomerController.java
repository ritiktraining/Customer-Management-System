package com.customer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/welcome")
public class WelcomeCustomerController {
	@RequestMapping(method = RequestMethod.GET)
	public String updateForm() {
		return "index.jsp";
	}

}
