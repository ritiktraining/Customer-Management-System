package com.customer.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping(path = "/update")
public class UpdateCustomerController {

	@Autowired
	private CustomerServices customerServices;

	@RequestMapping(method = RequestMethod.GET)
	public String updateForm(HttpServletRequest req) {
		ArrayList<CountryEntity> countryList = customerServices.getCountry();


		ArrayList<IndiaStateEntity> indiaStates = customerServices.getIndiaStates();

		ArrayList<AustraliaStateEntity> australiaStates = customerServices.getAustraliaStates();

		ArrayList<CanadaStateEntity> canadaStates = customerServices.getCanadaStates();

		ArrayList<UsaStateEntity> usaStates = customerServices.getUsaStates();

		req.setAttribute("countryList", countryList);
		req.setAttribute("indiaList", indiaStates);
		req.setAttribute("australiaList", australiaStates);
		req.setAttribute("canadaList", canadaStates);
		req.setAttribute("usaList", usaStates);
		return "updatecustomer.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String updateDisplay(CustomerEntity customer, HttpServletRequest request) {
		customerServices.updateCustomer(customer);
		request.setAttribute("customer", customer);
		return "updatecustomerdisplay.jsp";
	}

}
