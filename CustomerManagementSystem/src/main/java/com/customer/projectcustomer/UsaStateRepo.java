package com.customer.projectcustomer;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.customer.entity.UsaStateEntity;

public interface UsaStateRepo extends CrudRepository<UsaStateEntity, Integer>{
	public ArrayList<UsaStateEntity> findAll();

}
