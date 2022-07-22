package com.customer.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.customer.entity.CustomerEntity;
import com.customer.services.CustomerServices;

@Controller
@RequestMapping(path = "/remove")
public class DeleteCustomerController {
	@Autowired
	private CustomerServices customerServices;

	@RequestMapping(method = RequestMethod.GET)
	public String removeForm(CustomerEntity customer) {

		return "removecustomer.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String removeDisplay(CustomerEntity customer, HttpServletRequest req) {
		
//		CustomerEntity entity = customerServices.searchbycust(customer.getCustomerId());
//		model.addAttribute("customerList", entity);
//		if (customer.getCustomerId() != 0 && customer.getCustomerId() != 0) {
//		}
		
		customerServices.removeCustomer(customer);
		req.setAttribute("customer", customer);


		return "removecustomerdisplay.jsp";
	}

}
