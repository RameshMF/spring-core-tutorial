package com.javadevsguide.springframework.aop.service;

import com.javadevsguide.springframework.aop.model.Employee;

public class EmployeeService {

	private Employee employee;
	
	public Employee getEmployee(){
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}
}
