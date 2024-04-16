package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.EmployeeNotFound;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public String saveEmployeeDetails(Employee employee) {
		
		employeeRepository.save(employee);
		
		return "Employee Details Saved successfully";
	}

	@Override
	public List<Employee> getallEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findByEmpId(Integer empId) {
		
		Optional<Employee> optEmployee = employeeRepository.findByEid(empId);
		
		if(optEmployee.isPresent()) {
			return optEmployee.get();
		}else {
			throw new EmployeeNotFound("Employee Not Found");
		}
	}

	@Override
	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Employee Details Updated successfully";
	}

	@Override
	public String deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		return "Employee deleted successfully";
	}

	
}
