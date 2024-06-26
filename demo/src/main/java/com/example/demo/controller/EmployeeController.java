package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ApiResponse;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.util.DemoUtil;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DemoUtil demoUtil;

	@GetMapping("/greet")
	public String greeting() {
		return "Hello - RESTFul webservice";
	}

	@PostMapping("/employee")
	public ResponseEntity<ApiResponse> saveEmployee(@Valid @RequestBody Employee employee) {
		log.info("Request received for save employee = "+employee.getEid());
		ApiResponse apiResponse = employeeService.saveEmployeeDetails(employee);
		log.info("Save employee response = "+demoUtil.convertObjectToJson(apiResponse));
		return new ResponseEntity<>(apiResponse,HttpStatus.OK);
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
	public String deleteEmployee(@PathVariable Integer empId) {
		return employeeService.deleteEmployee(empId);
	}

	//Add Method Delete 

}

