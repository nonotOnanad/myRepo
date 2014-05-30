package com.sample.main;

import com.sample.base.PrintBase;
import com.sample.model.StudentRecord;
import com.sample.util.Printer;

public class Runner{
	
	public static void main(String[] args) {
		//instantiate StudentRecord to contain student data.
		StudentRecord studRec = new StudentRecord();
		//set values for variables
		studRec.setName("Mark");
		studRec.setAddress("Taguig");
		studRec.setStudentNo("0001");
		
		//instantiate Concrete class.
		Printer printUtil = new Printer();
		//call instance method.
		printUtil.printStudentRecord(studRec);
		
		//call non abstract method in PrintBase
		PrintBase.printSample();
	}

}
