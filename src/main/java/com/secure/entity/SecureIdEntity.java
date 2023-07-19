package com.secure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Entity
@Table(name="COUNTRY_DETAILS")
public class SecureIdEntity {
	
	@Id
	@Column(name="COUNTRY_ID")
	private Integer id;
	
	@Column(name="COUNTRY_NAME")
	private String countryName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

}
