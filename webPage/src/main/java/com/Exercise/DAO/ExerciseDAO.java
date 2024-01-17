package com.Exercise.DAO;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Exercise.Entity.exercise;

@Repository
public class ExerciseDAO {

	@Autowired
	SessionFactory factory;
	
	public exercise  saveData(exercise ex)
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(ex);
		tx.commit();
		return ex;
		
	}
	
	public List<exercise> getAllData()
	{
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(exercise.class);
		
		return criteria.list();
	}
	
}
