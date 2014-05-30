package com.sample.main;

import java.util.Scanner;

import com.sample.util.RegExUtil;
/**
 * Sample Runner class that uses simple RegEx validations.
 * @author monanad
 *
 */
public class RegExRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String userInput;

		System.out.println("Please input string : ");
		userInput = scanner.nextLine();

		if(null == userInput || userInput.trim().isEmpty() == false){
			if(RegExUtil.isAlpha(userInput))
				System.out.println("input is Alpha");
			if(RegExUtil.isNumeric(userInput))
				System.out.println("input is Numeric");
			if(RegExUtil.isAlphaNumeric(userInput))
				System.out.println("input is AlphaNumeric");
			else
				System.out.println("input has special characters.");
		} else
			System.out.println("input is empty or null");
	}

}
