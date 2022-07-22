package com.customer.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CUSTOMER_COUNTRY_TBL")
public class CountryEntity {
	@Id
	@Column(name = "country_id")
	private Integer countryID;
	@Column(name = "country_code")
	private String countryCode;
	@Column(name = "country_name")
	private String countryName;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "created_on")
	private Date createdOn;
	@Column(name = "updated_by")
	private String updatedBy;
	@Column(name = "udpated_on")
	private Date updatedOn;

}
