package com.sample.ddp.runner;

import com.sample.ddp.dao.StudentDao;
import com.sample.ddp.dao.impl.StudentDaoImpl;
import com.sample.ddp.model.Student;

public class Runner {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
		
		//print all students
		for(Student student : studentDao.getAllStudents()){
			System.out.println("Student: [RollNo : "+ student.getRollNo()+ 
					", Name : "+ student.getName());
		}
		
		//update student
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		
		//get the student
		student = studentDao.getStudent(0);
		System.out.println("Student: [RollNo : "+
				student.getRollNo()+ ", Name : "+ student.getName() + " ]");
	}

}
