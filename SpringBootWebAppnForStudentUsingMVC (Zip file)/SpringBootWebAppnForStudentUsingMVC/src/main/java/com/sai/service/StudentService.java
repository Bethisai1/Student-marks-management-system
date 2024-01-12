package com.sai.service;

import java.util.List;

import com.sai.model.Student;

public interface StudentService {
     public Student saveStudent(Student student);
     public Student updateStudent(Student student);
     public void deleteStudent(int stdRollNo);
     public Student getStudent(int stdRollNo);
     public List<Student>getAllStudents();
}
