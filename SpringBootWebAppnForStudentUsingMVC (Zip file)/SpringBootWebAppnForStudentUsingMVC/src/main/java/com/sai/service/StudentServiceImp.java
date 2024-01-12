package com.sai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.model.Student;
import com.sai.repository.StudentRepo;
@Service
public class StudentServiceImp implements StudentService {
	
    @Autowired
    private StudentRepo repo;
	@Override
	public Student saveStudent(Student student) {
		int tot=0;
		double percent=0.0;
		String grade=null,res=null;
		tot=student.getHibernate()+student.getSpring()+student.getSpringboot();
		percent=tot/3;
		if(percent>=70)
		{
			grade="A grade";
		}
		else if(percent>=60)
		{
			grade="B grade";
		}
		else if(percent>=50)
		{
			grade="C grade";
		}
		else
		{
			grade="D grade";
		}
		if(student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpringboot()>=35)
		{
			res="pass";
		}
		else
		{
			res="Fail";
		}
		student.setTotalmarks(tot);
		student.setPercentage(percent);
		student.setGrade(grade);
		student.setResult(res);
		Student save=repo.save(student);
		return save;
	}
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> allstudents=repo.findAll();
		return allstudents;
	}

	@Override
	public void deleteStudent(int stdRollNo) {
		repo.deleteById(stdRollNo);
      
	}

	@Override
	public Student getStudent(int stdRollNo) {
		Student get=repo.findById(stdRollNo).get();
		return get;
	}

	@Override
	public Student updateStudent(Student student) {
		
		int tot=0;
		double percent=0.0;
		String grade=null,res=null;
		tot=student.getHibernate()+student.getSpring()+student.getSpringboot();
		percent=tot/3;
		if(percent>=70)
		{
			grade="A grade";
		}
		else if(percent>=60)
		{
			grade="B grade";
		}
		else if(percent>=50)
		{
			grade="C grade";
		}
		else
		{
			grade="D grade";
		}
		if(student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpringboot()>=35)
		{
			res="pass";
		}
		else
		{
			res="Fail";
		}
		student.setTotalmarks(tot);
		student.setPercentage(percent);
		student.setGrade(grade);
		student.setResult(res);
		Student save=repo.save(student);
		return save;
	}
	
	
	
	
	

	
	
	
}
