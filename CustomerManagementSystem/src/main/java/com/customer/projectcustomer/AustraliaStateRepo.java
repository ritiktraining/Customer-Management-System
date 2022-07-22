package com.customer.projectcustomer;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.customer.entity.AustraliaStateEntity;

public interface AustraliaStateRepo extends CrudRepository<AustraliaStateEntity, Integer>{
	public ArrayList<AustraliaStateEntity> findAll();

}
