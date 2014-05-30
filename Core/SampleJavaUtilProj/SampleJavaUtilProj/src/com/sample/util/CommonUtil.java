package com.sample.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
/**
 * Create this class to externalize methods that may be re-used.
 * 
 * @author monanad
 *
 */
public class CommonUtil {
	
	private static final String SPACE_DELIMETER = " ";
	
	/**
	 * This method accepts String input and returns tokenized value.
	 * @param userInput
	 * @return @See StringTokenizer
	 */
	public static StringTokenizer tokenizeStringInput(String userInput) {
		//This is a StringTokenizer util object, we can set delimeter if wanted. Just modify the constructor.
		StringTokenizer tokens = new StringTokenizer(userInput, SPACE_DELIMETER);
		return tokens;
	}

	
	/**
	 * This method prints the tokens and index.
	 * @param tokens
	 */
	public static void printTokens(StringTokenizer tokens) {
		int counter = 1; 
		//this will print the tokens
		while(tokens.hasMoreTokens()){
			System.out.println("token ["+counter+"] : "+tokens.nextToken());
			counter++; //increment counter
		}
	}
	
	/**
	 * This method returns formatted date string value.
	 * @param dateFormat
	 * @param date
	 * @return @String
	 */
	public static String formatDate(String dateFormat, Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat (dateFormat);
		return formatter.format(date);
	}
	
	/**
	 * This method will return parse Date object from string value.
	 * @param dateFormat
	 * @param dateStr
	 * @return @See Date
	 */
	public static Date parseStringToDate(String dateFormat, String dateStr){
		SimpleDateFormat formatter = new SimpleDateFormat (dateFormat);
		try {
			return formatter.parse(dateStr);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + formatter); 
			return null;
		}
	}
}
