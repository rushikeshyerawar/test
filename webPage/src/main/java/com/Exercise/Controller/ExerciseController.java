package com.Exercise.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Exercise.DAO.ExerciseDAO;
import com.Exercise.Entity.exercise;

@RestController
@CrossOrigin("http://localhost:4200")

public class ExerciseController {

	@Autowired
	ExerciseDAO dao;
	
	@RequestMapping("saveData")
	public exercise saveData(@RequestBody exercise ex)
	{
		exercise exe;
		exe=dao.saveData(ex);
		return exe;
	}
	
	@RequestMapping("getAllData")
	public List<exercise> getAllData()
	{
		ArrayList<exercise> list=new ArrayList<exercise>();
		list=(ArrayList<exercise>) dao.getAllData();
		return list;
		
	}
}
