package com.DNG.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DNG.employeeDAO.EmployeeDAO;
import com.DNG.entity.employee;
import com.DNG.service.EmployeeService;


@CrossOrigin("http://localhost:4200")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	@Autowired
	EmployeeDAO dao;
	
	@GetMapping("getAllEmployee")
	public ResponseEntity<List<employee>> getAllEmployee()
	{
		List<employee> emp =new ArrayList<employee>();
		emp=dao.getAllEmployee();
		return new ResponseEntity<List<employee>>(emp,HttpStatus.OK) ;
	}
	
	@RequestMapping("saveEmployee")
	public void  saveEmployee(@RequestBody employee emp)
	{
		dao.saveEmployee(emp);
		
	}
}
