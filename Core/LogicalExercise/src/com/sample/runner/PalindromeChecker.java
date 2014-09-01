package com.sample.runner;

public class PalindromeChecker {

	public static void main(String[] args) {
		String inputStr="abbabbabba", 
				reverse="";

		for(int i=inputStr.length()-1; i >= 0; i--){
			reverse+=inputStr.charAt(i);
		}
		
		if(inputStr.equalsIgnoreCase(reverse)){
			System.out.println("String "+inputStr+" is a palindrome");
		}else{
			System.out.println("String "+inputStr+" is NOT a palindrome");
		}
	}

}
