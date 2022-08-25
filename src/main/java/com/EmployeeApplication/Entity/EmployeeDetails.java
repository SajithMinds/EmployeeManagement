package com.EmployeeApplication.Entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class EmployeeDetails {
	public List<Employees> employee=new ArrayList<>(Arrays.asList(new Employees(101,"Rahul",27000),
			new Employees(102,"Abhinav",35500),
			new Employees(103,"Sagar",45000),
			new Employees(104,"Sai",25000),
			new Employees(105,"Pretham",37700),
			new Employees(106,"Ravi",32000),
			new Employees(107,"Prasad",77000),
			new Employees(108,"Raju",67000),
			new Employees(109,"Raghu",47000),
			new Employees(110,"Peter",48500)));

public List<Employees> getAllStudents() {
	return employee;
	
}	

public Employees save(Employees p) {
	 Employees employees=new Employees();
	    employees.setId(p.getId());
	    employees.setName(p.getName());
	    employees.setSalary(p.getSalary());
	 employee.add(employees);
	 return employees;
}
}