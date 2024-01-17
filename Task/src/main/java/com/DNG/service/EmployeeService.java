package com.DNG.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DNG.employeeDAO.EmployeeDAO;
import com.DNG.entity.employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO dao;
	
	public List<employee> getAllEmployee()
	{
		return dao.getAllEmployee();
	}
}
