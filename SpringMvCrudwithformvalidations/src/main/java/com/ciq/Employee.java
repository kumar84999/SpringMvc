package com.ciq;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {
	
	
	@NotNull(message="this is may not be null")
	private int id;
	@NotEmpty(message="this is may not be empty")
	private String name;
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@NotNull@Past
	private Date dob;
	@NotNull
	private String city;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Date dob, String city) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", city=" + city + "]";
	}
	
	
	

}
