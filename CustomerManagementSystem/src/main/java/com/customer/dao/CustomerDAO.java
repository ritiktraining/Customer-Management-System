package com.customer.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.entity.AustraliaStateEntity;
import com.customer.entity.CanadaStateEntity;
import com.customer.entity.CountryEntity;
import com.customer.entity.CustomerEntity;
import com.customer.entity.IndiaStateEntity;
import com.customer.entity.UsaStateEntity;
import com.customer.projectcustomer.AustraliaStateRepo;
import com.customer.projectcustomer.CanadaStateRepo;
import com.customer.projectcustomer.CountryRepo;
import com.customer.projectcustomer.CustomerRepository;
import com.customer.projectcustomer.IndiaStateRepo;
import com.customer.projectcustomer.UsaStateRepo;

@Repository
public class CustomerDAO {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CountryRepo countryRepo;
//
//	@Autowired
//	private StateRepo stateRepo;

	@Autowired
	private AustraliaStateRepo australiaStateRepo;

	@Autowired
	private IndiaStateRepo indiaStateRepo;

	@Autowired
	private UsaStateRepo usaStateRepo;

	@Autowired
	private CanadaStateRepo canadaStateRepo;

	@Transactional
	public ArrayList<UsaStateEntity> getUsaStates() {
		return usaStateRepo.findAll();
		 
	}
	
	@Transactional
	public ArrayList<IndiaStateEntity> getIndiaStates() {
		return indiaStateRepo.findAll();
	}
	
	@Transactional
	public ArrayList<CanadaStateEntity> getCanadaStates() {
		return canadaStateRepo.findAll();
	}
	
	@Transactional
	public ArrayList<AustraliaStateEntity> getAustraliaStates() {
		return australiaStateRepo.findAll();
	}

		
	
	@Transactional
	public void addCustomer(CustomerEntity customer) {
		customerRepository.save(customer);

	}

	@Transactional
	public void removeCustomer(CustomerEntity customer) {
		customerRepository.delete(customer);
	}

	@Transactional
	public ArrayList<CustomerEntity> searchCustomerById(Integer id) {

		return customerRepository.findByCustomerId(id);
	}

	@Transactional
	public CustomerEntity searchbycust(Integer id) {
		CustomerEntity entity = customerRepository.findByCustId(id);
		return entity;

	}

	@Transactional
	public ArrayList<CustomerEntity> searchCustomer() {

		return customerRepository.findAll();

	}

	@Transactional
	public void updateCustomer(CustomerEntity customer) {
		customerRepository.save(customer);
	}

	@Transactional
	public ArrayList<CountryEntity> getCountry() {
		ArrayList<CountryEntity> employeeList = countryRepo.findAll();
		return employeeList;
	}

//	@Transactional
//	public ArrayList<StateEntity> getState() {
//		return stateRepo.findAll();
//	}

}
