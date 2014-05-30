package com.sample.main;

import com.sample.model.Employee;

public class Runner {
	
	public static void main(String[] args) {
		
		/* Note: All Classes inherit the default methods of the Object class implicitly. */
		
		//The Object parent class of ALL java objects.
		Object object = new Object();
		//object.equals(arg0);
		object.getClass();
		object.hashCode();
		object.notify();
		object.notifyAll();
		object.toString();
		//object.wait();
		//object.wait(arg0, arg1);
		
		//a sample class in java.lang package
		String str =  new String();
		//str.equals(arg0);
		str.getClass();
		str.hashCode();
		str.notify();
		str.notifyAll();
		str.toString();
		//str.wait();
		//str.wait(arg0, arg1);
		
		//a sample class defined or created in com.sample.model package.
		Employee employee = new Employee();
		//employee.equals(arg0);
		employee.getClass();
		employee.hashCode();
		employee.notify();
		employee.notifyAll();
		employee.toString();
		//employee.wait();
		//employee.wait(arg0, arg1);
	}

}
