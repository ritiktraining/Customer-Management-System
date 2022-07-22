package com.customer.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_DETAILS_TABLE")
public class CustomerEntity {
	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CUST_SEQ")
	@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
	private Integer customerId;
	@Column(name = "customer_no")
	private Integer customerNo;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "customer_type")
	private String customerType;
	@Column(name = "customer_phone")
	private Long customerPhone;
	@Column(name = "street")
	private String street;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "created_on")
	private Date createdOn;
	@Column(name = "updated_by")
	private String updatedBy;
	@Column(name = "updated_on")
	private Date updatedOn;

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(Integer customerId, Integer customerNo, String customerName, String customerType,
			Long customerPhone, String street, String city, String state, String country, String createdBy,
			Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.customerId = customerId;
		this.customerNo = customerNo;
		this.customerName = customerName;
		this.customerType = customerType;
		this.customerPhone = customerPhone;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(Integer customerNo) {
		this.customerNo = customerNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Long getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(Long customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}
