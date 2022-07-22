package com.customer.projectcustomer;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.customer.entity.IndiaStateEntity;

public interface IndiaStateRepo extends CrudRepository<IndiaStateEntity, Integer>{
	public ArrayList<IndiaStateEntity> findAll();


}
