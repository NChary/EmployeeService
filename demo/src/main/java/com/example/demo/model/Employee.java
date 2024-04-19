package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employee")
public class Employee {

	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment value
	@Column(name="id")
	private int id;
		
	@Column(name="emp_id")
	private int eid;
	
	@NotEmpty(message="Employee Name is mandatory")
	@Column(name="emp_name")
	private String name;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="salary")
	private double salary;
}
