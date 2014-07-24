package com.sample.mvcdp.runner;

import com.sample.mvcdp.controller.StudentController;
import com.sample.mvcdp.model.Student;
import com.sample.mvcdp.view.StudentView;

public class Runner {

	public static void main(String[] args) {
		//fetch student record based on his roll no from the database
		Student model = retrieveStudentFromDatabase();
		
		//Create a view: to write student details on console
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		
		//update model data
		controller.setStudentName("John");
		controller.updateView();
	}

	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

}
