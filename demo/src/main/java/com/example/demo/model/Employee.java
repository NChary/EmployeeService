package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment value
	@Column(name="id")
	private int id;
	
	@Column(name="emp_id")
	private int eid;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="salary")
	private double salary;
	
	public int getId() {
		return id;
	}
	public int getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
