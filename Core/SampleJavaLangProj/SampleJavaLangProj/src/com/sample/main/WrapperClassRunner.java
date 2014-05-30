package com.sample.main;

import java.util.ArrayList;
import java.util.List;

import com.sample.util.WrapperClassUtil;

public class WrapperClassRunner {

	public static void main(String[] args) {
		/* 
		 * Note: Primitive data types starts with small letters 
		 * while WRAPPER classes starts with capital letters.
		 * /
		
		/*
		 * Sample Primitive variables. 
		 * By default has values respectively.
		 */
		boolean booleanVar;
		byte byteVar;                                 
		char charVar;                         
		double doubleVar;                       
		float  floatVar;                     
		int intVar;                     
		long longVar;                          
		short shortVar;                        

		/*
		 * Sample Wrapper classes variables. 
		 * By default value is NULL because they are objects.
		 * Can be instantiated using the 'new' operator. ex. Boolean varA = new Boolean(true);
		 */
		Boolean booleanVarWrap = new Boolean(true);
		Byte byteVarWrap = null;
		Character charVarWrap = null;
		Double doubleVarWrap = new Double(1.0);
		Float floatVarWrap = null;
		Integer integerVarWrap = null;
		Long longVarWrap = null;
		Short shortVarWrap = new Short("5");
		
		doubleVar = doubleVarWrap.doubleValue();
		String no = "100";
		intVar = Integer.parseInt(no);
		
		//Collections accepts Objects only not primitive.
		List<Boolean> employeeList = new ArrayList<Boolean>();
		employeeList.add(Boolean.FALSE);
		
		
		//call a method that accepts an Object data type.
		WrapperClassUtil util = new WrapperClassUtil();
		//we can use Wrapper classes as parameters since they are objects.
		util.printWrapperClassType(shortVarWrap);
		
		//This is the System class
		System.getenv();
		System.out.println("Hello there");
	}

}
