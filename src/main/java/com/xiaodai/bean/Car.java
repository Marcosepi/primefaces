package com.xiaodai.bean;

import java.io.Serializable;

public class Car implements Serializable{
	
	private String model ;
	private String year ;
	private String manufacturer ;
	private String color ;

	public Car(String model,String year,String manufacturer,String color){
		this.color = color;
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
	}
	public Car(){
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getManufacture() {
		return manufacturer;
	}

	public void setManufacture(String manufacturer ) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
