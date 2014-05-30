package com.sample.main;

import java.util.Calendar;
import java.util.Date;

import com.sample.util.CommonUtil;

public class DateRunner {

	private static final String YYYY_MM_DD = "yyyy-MM-dd";
	private static final String E_YYYY_MM_DD_AT_HH_MM_SS_A_ZZZ = "E yyyy.MM.dd 'at' hh:mm:ss a zzz";

	public static void main(String[] args) {
		Date todayDate = new Date();//this code will get the current date today.
		Date yesterdayDate = new Date("02/23/2014");
		
		System.out.println("yesterdayDate : "+yesterdayDate);
		System.out.println("todayDate : "+todayDate);
		
		//will return true if yesterdayDate is later than the todayDate.
		System.out.println("todayDate.after(yesterdayDate) : "+todayDate.after(yesterdayDate));
		
		//will return true if yesterdayDate is earlier than the todayDate.
		System.out.println("yesterdayDate.before(todayDate) : "+yesterdayDate.before(todayDate));
		
		//will clone/create a copy of the todayDate.
		Date cloneDate = (Date) todayDate.clone();
		System.out.println("cloneDate : "+cloneDate);
		
		/* will compare Date values. */
		
		//will return a positive digit if 1st is later than the 2nd.
		System.out.println("todayDate.compareTo(yesterdayDate) : "+todayDate.compareTo(yesterdayDate));
		
		//will return 0 if 1st is equal to 2nd.
		System.out.println("todayDate.compareTo(cloneDate) : "+todayDate.compareTo(cloneDate));
		
		//will return a negative digit if 1st is earlier than 2nd.
		System.out.println("yesterdayDate.compareTo(todayDate) : "+yesterdayDate.compareTo(todayDate));
		
		//this will throw ClassCastException
		//Date anotherDate = (Date) new Object();
		//cloneDate.compareTo(anotherDate);
		
		//Returns the number of milliseconds that have elapsed since January 1, 1970.
		System.out.println("todayDate.getTime() : "+todayDate.getTime());
		
		
		/* Date formatter util */
	   	System.out.println("Date formatted : " + CommonUtil.formatDate(E_YYYY_MM_DD_AT_HH_MM_SS_A_ZZZ, todayDate));
	   	
	   	//using the parse() method.
	   	String dateStr = "2014-02-24";
		System.out.println("Date parsed : " + CommonUtil.parseStringToDate(YYYY_MM_DD, dateStr));
		
		
		/* Calendar util */
		//this code will get the current date today in Gregorian calendar format.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println( cal.getTime()); //this is the current date only.
		System.out.println( cal.get(cal.DAY_OF_YEAR));
		System.out.println( cal.get(cal.HOUR_OF_DAY));

	}

	

}
