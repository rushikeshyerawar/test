package com.DNG.employeeDAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.DNG.entity.employee;

@Repository
public class EmployeeDAO {

	@Autowired
	SessionFactory factory;
	
	public List<employee> getAllEmployee()
	{
		Session session=factory.openSession();
		return session.createCriteria(employee.class).list();		

	}
	
	public void saveEmployee(employee emp)
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(emp);
		tx.commit();
		
	}
	
}
