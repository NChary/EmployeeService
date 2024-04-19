package com.example.demo.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.model.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BindException.class)
	public ResponseEntity<ApiResponse> handleBindException(BindException ex) {
		
		ApiResponse apiResponse = ApiResponse.builder()
				.statusCode("902")
				.message(ex.getFieldError().getDefaultMessage())
				.build();
		
		return new ResponseEntity<>(apiResponse,HttpStatus.BAD_REQUEST);
	}


	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<ApiResponse> employeeNotFound(EmployeeNotFound employee) {
		return new ResponseEntity<>(new ApiResponse("000",employee.getMessage()),HttpStatus.OK);
	}

}
