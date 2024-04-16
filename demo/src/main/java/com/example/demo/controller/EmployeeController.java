package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/greet")
	public String greeting() {
		return "Hello - RESTFul webservice";
	}
	
	@PostMapping("/employee")
	public String saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployeeDetails(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return employeeService.getallEmployees();
	}

	@GetMapping("/employee/{empId}")
	public Employee findByEmployeeId(@PathVariable Integer empId){
		return employeeService.findByEmpId(empId);
	}

	//Update
	@PutMapping("/employee")
	public String updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	//Delete
	@DeleteMapping("/employee/{empId}")
	public String deleteEmployee(@PathVariable Long empId) {
		return employeeService.deleteEmployee(empId);
	}
}
