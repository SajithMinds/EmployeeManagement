package com.EmployeeApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.EmployeeApplication.Entity.EmployeeDetails;
import com.EmployeeApplication.Entity.Employees;

@Component
public class EmployeeService {
	@Autowired
	private EmployeeDetails repos ;
	
	public Employees saveProduct(Employees employees) {
		return repos.save(employees);
	}

	public List<Employees> getStudents(){
		return repos.getAllStudents();
	}

}
