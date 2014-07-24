package com.sample.todp.runner;

import com.sample.todp.bo.StudentBO;
import com.sample.todp.vo.StudentVO;

public class Runner {

	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();
		
		//print all students
		for(StudentVO student : studentBusinessObject.getAllStudents()){
			System.out.println("Student: [RollNo : "+ student.getRollNo() + 
					", Name : "+ student.getName() + " ]");
		}
		
		//update student
		StudentVO student = studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		studentBusinessObject.update(student);
		
		//get the student
		studentBusinessObject.getStudent(0);
		System.out.println("Student: [RollNo : "+student.getRollNo()+
				", Name : "+ student.getName() + " ]");
	}

}
