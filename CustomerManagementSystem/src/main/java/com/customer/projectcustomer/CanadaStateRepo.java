package com.customer.projectcustomer;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.customer.entity.CanadaStateEntity;

public interface CanadaStateRepo extends CrudRepository<CanadaStateEntity, Integer>{
	public ArrayList<CanadaStateEntity> findAll();

}
