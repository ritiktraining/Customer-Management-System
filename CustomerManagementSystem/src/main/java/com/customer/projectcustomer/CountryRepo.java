package com.customer.projectcustomer;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.customer.entity.CountryEntity;

public interface CountryRepo extends CrudRepository<CountryEntity, Integer>{
	public ArrayList<CountryEntity> findAll();

}
