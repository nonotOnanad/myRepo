package com.sample.runner;

public class InterchageValues {
	
	public static void main2(String[] args){
		int a=20, b=89;
		System.out.println("Original values");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("\nAfter switching values");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	
	public static void main(String[] args){
		String a="mark", b="anthony";
		System.out.println("Original values");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		a=a+b;
		b=a.substring(0,(a.length()-b.length()));
		a=a.substring(b.length(),a.length());
		
		System.out.println("\nAfter switching values");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}
