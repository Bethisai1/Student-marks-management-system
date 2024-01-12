package com.sai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sai.model.Student;
import com.sai.service.StudentService;
@Controller
public class StudentController 
{
	@Autowired
	private StudentService service;
   
	@RequestMapping("/")
    public String homePage()
    {
    	return "home";
    }
    @RequestMapping("/addstudent")
    public String StudentForm()
    {
    	return "savestudent";
    }
    @RequestMapping("/register")
    public String Register(Student student)
    {
    	service.saveStudent(student);
    	return "success";
    }
    @RequestMapping("/viewStudents")
    public String viewAllStudents(Student student,ModelMap model)
    {
    	model.put("students", service.getAllStudents());
    	return "viewform";
    }
    @RequestMapping("/delete/{stdRollNo}")
    public String delete(@PathVariable int stdRollNo )
    {
    	service.deleteStudent(stdRollNo);
    	return "redirect:/viewStudents";
    }
    @RequestMapping("/edit/{stdRollNo}")
    public String edit(@PathVariable int stdRollNo,ModelMap model)
    {
    	model.put("command", service.getStudent(stdRollNo));
    	return "editform";
    }
    @RequestMapping("/editandsave")
    public String editAndSave(Student student)
    {
    	service.updateStudent(student);
    	return "redirect:/viewStudents";
    }
}
