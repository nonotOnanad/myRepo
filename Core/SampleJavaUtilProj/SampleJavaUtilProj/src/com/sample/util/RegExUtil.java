package com.sample.util;
/**
 * Utility class to check input by using regex pattern matching.
 * @author monanad
 *
 */
public class RegExUtil {
	
	public static boolean isAlpha(String input){
		return input.matches("[a-zA-Z]*$");
	}
	
	public static boolean isNumeric(String input){
		return input.matches("[0-9]*$");
	}
	
	public static boolean isAlphaNumeric(String input){
		return input.matches("^[a-zA-Z0-9]*$");
	}
}
