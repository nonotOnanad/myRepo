package com.sample.main;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.sample.util.CommonUtil;
/**
 * This a sample class that uses the following built-in Util classess (Scanner and StringTokenzier).
 * @author monanad
 *
 */
public class ScannerAndStringTokenizerRunner {

	public static void main(String[] args) {
		//Instantiate Scanner util object
		Scanner scanner = new Scanner(System.in);
		//variable that will contain user input.
		String userInput;
		
		System.out.println("Please input string to be tokenized : ");
		//this line of code will get user input and set value to variable varA.
		userInput = scanner.nextLine();
		//print userInput
		System.out.println("userInput : "+userInput);
		
		StringTokenizer tokens = CommonUtil.tokenizeStringInput(userInput);
		
		//will print no. of tokens created by using the delimeter.
		System.out.println("No. of tokens : "+tokens.countTokens());
		
		CommonUtil.printTokens(tokens);
	}

}