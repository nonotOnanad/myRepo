package com.sample.ddp.dao;

import java.util.List;

import com.sample.ddp.model.Student;

public interface StudentDao {
	public List<Student> getAllStudents();
	public Student getStudent(int rollNo);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
}
