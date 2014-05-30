package com.sample.util;

import com.sample.base.PrintBase;
import com.sample.model.StudentRecord;
/**
 * This is a Concrete class implementing the abstract class Print
 * @author monanad
 *
 */
public class Printer extends PrintBase {

	//This is an implementation of abstract method.
	public void printStudentRecord(StudentRecord studRec) {
		System.out.println("===printStudentRecord===");
		System.out.println("Student Name: "+studRec.getName());
		System.out.println("Student No: "+studRec.getStudentNo());
		System.out.println("Student Address: "+studRec.getAddress());
		System.out.println("===end of method===\n");
	}

}
