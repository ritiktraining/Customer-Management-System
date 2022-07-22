package com.customer.projectcustomer;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.customer.entity.CustomerEntity;


public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {
	
	public ArrayList<CustomerEntity> findAll();
	
	@Query(value = "select * from customer_details_table  where customer_id = :no", nativeQuery = true)
	ArrayList<CustomerEntity> findByCustomerId(@Param("no") Integer no);
	
	@Query(value = "select * from customer_details_table  where customer_id = :no", nativeQuery = true)
	CustomerEntity findByCustId(@Param("no") Integer no);
	
	

}
