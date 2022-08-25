package com.EmployeeApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeApplication.Entity.Employees;
import com.EmployeeApplication.Service.EmployeeService;

@RestController
@RequestMapping("/Employee")

public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@PostMapping("/save")
	public Employees addProduct(@RequestBody Employees employees) {
		return service.saveProduct(employees);
		
	}

	@GetMapping("/list")
	public List<Employees> findAllStudents(){
		return service.getStudents();
	}
}
