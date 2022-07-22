package com.customer.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.customer.entity.CustomerEntity;
import com.customer.services.CustomerServices;

@Controller

public class SearchCustomerController {

	@Autowired
	private CustomerServices customerServices;

	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public String searchForm() {
		return "searchcustomer.jsp";
	}

	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public String searchDisplay(CustomerEntity customer , Model model) {
		
		ArrayList<CustomerEntity> arrayList = customerServices.searchCustomerById(customer.getCustomerId());
		model.addAttribute("customerList", arrayList);
		
		return "searchcustomerdisplay.jsp";
	}

	@RequestMapping(path = "/searchall", method = RequestMethod.POST)
	public String searchallDisplay(CustomerEntity customer, HttpServletRequest request) {
		ArrayList<CustomerEntity> arrayList = customerServices.searchCustomer();
		request.setAttribute("customerList", arrayList);
		return "searchallcustomerdisplay.jsp";
	}

}
