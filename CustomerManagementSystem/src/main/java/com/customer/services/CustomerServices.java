package com.customer.services;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.CustomerDAO;
import com.customer.entity.AustraliaStateEntity;
import com.customer.entity.CanadaStateEntity;
import com.customer.entity.CountryEntity;
import com.customer.entity.CustomerEntity;
import com.customer.entity.IndiaStateEntity;
import com.customer.entity.UsaStateEntity;

@Service
public class CustomerServices {

	@Autowired
	private CustomerDAO customerDAO;

	public void addCustomer(CustomerEntity customer) {
		customerDAO.addCustomer(customer);
	}

	public void updateCustomer(CustomerEntity customer) {
		customerDAO.updateCustomer(customer);
	}

	public void removeCustomer(CustomerEntity customer) {
		customerDAO.removeCustomer(customer);
	}

	public ArrayList<CustomerEntity> searchCustomerById(Integer id) {

		return customerDAO.searchCustomerById(id);
	}

	public ArrayList<CustomerEntity> searchCustomer() {

		return customerDAO.searchCustomer();

	}

	public CustomerEntity searchbycust(Integer id) {
		CustomerEntity entity = customerDAO.searchbycust(id);
		return entity;

	}

	// To Get The COuntry
	public ArrayList<CountryEntity> getCountry() {
		return customerDAO.getCountry();

	}

	// To Get The States

	@Transactional
	public ArrayList<UsaStateEntity> getUsaStates() {
		return customerDAO.getUsaStates();

	}

	@Transactional
	public ArrayList<IndiaStateEntity> getIndiaStates() {
		return customerDAO.getIndiaStates();
	}

	@Transactional
	public ArrayList<CanadaStateEntity> getCanadaStates() {
		return customerDAO.getCanadaStates();
	}

	@Transactional
	public ArrayList<AustraliaStateEntity> getAustraliaStates() {
		return customerDAO.getAustraliaStates();
	}

}
