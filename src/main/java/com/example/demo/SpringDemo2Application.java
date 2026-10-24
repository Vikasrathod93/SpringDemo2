package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemo2Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringDemo2Application.class, args);
		Employee em = ac.getBean(Employee.class);
		System.out.println("Comapany Name " + em.getComapany());
		System.out.println("Employee Id " + em.getId());
		System.out.println("Employee Name " + em.getName());
	}
	

}
