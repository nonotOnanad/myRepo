package com.sample.base;

import com.sample.model.StudentRecord;

/**
 * This is sample Abstract class.
 * @author monanad
 *
 */
public abstract class PrintBase {
	
	//this is a sample static method of an abstract class.
	public static void printSample(){
		System.out.println("This is not an abstract method.");
	}
	
	/**
	 * this is a sample method declaration of an abstract method.
	 * the implementation of this method is in the Concrete class Printer.
	 * @param studRec
	 */
	public abstract void printStudentRecord(StudentRecord studRec);
}
