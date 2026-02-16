package com.cglia.onetoonemapping.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mapping_laptop")
public class Laptop {

	//Entity One to one Mapping For Laptopp Table
	@Id
	@Column(name = " LAPTOP_ID", unique = true, nullable = false)
	private int laptopId;

	@Column(name = "LAPTOP_BRAND")
	private String brand;

	@Column(name = "LAPTOP_MODELNUMBER")
	private String modelNumber;

	public Laptop(int laptopId, String brand, String modelNumber) {
		super();
		this.laptopId = laptopId;
		this.brand = brand;
		this.modelNumber = modelNumber;
	}

	public Laptop() {

	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

}


