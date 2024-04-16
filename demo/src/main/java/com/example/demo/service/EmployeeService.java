package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	public String saveEmployeeDetails(Employee employee); 

	public List<Employee> getallEmployees();
	
	public Employee findByEmpId(Integer empId);
	
	public String updateEmployee(Employee employee);
	
	public String deleteEmployee(Integer id);
}
