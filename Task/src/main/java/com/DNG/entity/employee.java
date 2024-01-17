package com.DNG.entity;

import javax.persistence.*;


@Entity
public class employee {

	@Id
	private int empid;
	private String name;
	private String email;
	private String phone;
	private int salary;
	private String department;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", salary="
				+ salary + ", department=" + department + "]";
	}
	public employee(int empid, String name, String email, String phone, int salary, String department) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.department = department;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
