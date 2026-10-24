package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id = 101;
	String name = "Vikas";
	String Comapany = "Kodnest";
	int salary = 900000;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String comapany, int salary) {
		super();
		this.id = id;
		this.name = name;
		Comapany = comapany;
		this.salary = salary;
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
	public String getComapany() {
		return Comapany;
	}
	public void setComapany(String comapany) {
		Comapany = comapany;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
