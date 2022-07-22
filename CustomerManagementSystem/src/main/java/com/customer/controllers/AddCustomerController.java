package com.customer.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.customer.entity.AustraliaStateEntity;
import com.customer.entity.CanadaStateEntity;
import com.customer.entity.CountryEntity;
import com.customer.entity.CustomerEntity;
import com.customer.entity.IndiaStateEntity;
import com.customer.entity.UsaStateEntity;
import com.customer.services.CustomerServices;

@Controller
@RequestMapping(path = "/add")
public class AddCustomerController {

	@Autowired
	private CustomerServices customerServices;
	
	@RequestMapping(method = RequestMethod.GET)
	public String saveForm(CustomerEntity customer, Model model) {

		ArrayList<CountryEntity> countryList = customerServices.getCountry();


		ArrayList<IndiaStateEntity> indiaStates = customerServices.getIndiaStates();

		ArrayList<AustraliaStateEntity> australiaStates = customerServices.getAustraliaStates();

		ArrayList<CanadaStateEntity> canadaStates = customerServices.getCanadaStates();

		ArrayList<UsaStateEntity> usaStates = customerServices.getUsaStates();

		model.addAttribute("countryList", countryList);
		model.addAttribute("indiaList", indiaStates);
		model.addAttribute("australiaList", australiaStates);
		model.addAttribute("canadaList", canadaStates);
		model.addAttribute("usaList", usaStates);

		return "addcustomer.jsp";

	}

//	@RequestMapping(method = RequestMethod.GET)
//	public String saveForm(CustomerEntity customer, HttpServletRequest req) {
//
//		ArrayList<CountryEntity> countryList = customerServices.getCountry();
//
//
//		ArrayList<IndiaStateEntity> indiaStates = customerServices.getIndiaStates();
//
//		ArrayList<AustraliaStateEntity> australiaStates = customerServices.getAustraliaStates();
//
//		ArrayList<CanadaStateEntity> canadaStates = customerServices.getCanadaStates();
//
//		ArrayList<UsaStateEntity> usaStates = customerServices.getUsaStates();
//
//		req.setAttribute("countryList", countryList);
//		req.setAttribute("indiaList", indiaStates);
//		req.setAttribute("australiaList", australiaStates);
//		req.setAttribute("canadaList", canadaStates);
//		req.setAttribute("usaList", usaStates);
//
//		return "addcustomer.jsp";
//
//	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveDisplay(CustomerEntity customer, HttpServletRequest request) {
		System.out.println(customer.getCustomerNo());
		request.setAttribute("customer", customer);
		customerServices.addCustomer(customer);

		return "addcustomerdisplay.jsp";

	}

}
