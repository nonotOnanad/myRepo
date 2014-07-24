package com.sample.ddp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.sample.ddp.dao.StudentDao;
import com.sample.ddp.model.Student;

public class StudentDaoImpl implements StudentDao {
	
	//list is working as a database
	List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		students.add(new Student("Robert", 0));
		students.add(new Student("John", 1));
	}
	
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() +
				", updated in the database");
		
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo()+ 
				", deleted from database");
	}

}
