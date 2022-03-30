package com.task1.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.task1.employee.repository.EmpRepository;

@SpringBootApplication
public class EmployeeApplication {
	@SuppressWarnings("rawtypes")
	@Autowired
    EmpRepository empRepository;
	@SuppressWarnings("hiding")
	public static <employee> void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
@SuppressWarnings("unused")
@GetMapping
public String employee() {
	employee e1 = new employee(1,"Uday",10000,"TamilNadu");
	employee e2 = new employee(1,"Divya",20000,"Hyderabad");
	employee e3 = new employee(1,"Teja",30000,"Bangalore");
	return employee();
}
}
	
	
	
	
	
     


