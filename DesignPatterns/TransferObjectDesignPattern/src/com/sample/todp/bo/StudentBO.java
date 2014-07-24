package com.sample.todp.bo;

import java.util.ArrayList;
import java.util.List;

import com.sample.todp.vo.StudentVO;

public class StudentBO {
	
	//list is working as a database
	List<StudentVO> students;
	
	public StudentBO() {
		students = new ArrayList<StudentVO>();
		students.add(new StudentVO("Robert", 0));
		students.add(new StudentVO("John", 1));
	}
	
	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No "+ student.getRollNo() + ", deleted from database");
	}
	
	//retrieve list of students from the database
	public List<StudentVO> getAllStudents() {
		return students;
	}
	
	public StudentVO getStudent(int rollNo) {
		return students.get(rollNo);
	}
	
	public void update(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	} 
}
