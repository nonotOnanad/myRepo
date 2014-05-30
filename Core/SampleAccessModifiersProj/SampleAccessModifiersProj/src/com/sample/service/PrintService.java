package com.sample.service;

public class PrintService {
	
	String printerId;
	public String printerName;
	protected int serialNo;
	private String printerUrl;
	
	//This is a method with default or no access modifier.
	void printAll(){
		System.out.println("Will print All.");
	}
	
	//This is a method with public access modifier.
	public void printVertical(){
		System.out.println("Will print vertically.");
	}
	
	
	//This is a method with protected access modifier.
	protected void printHorizontally(){
		System.out.println("Will print horizontally.");
	}
	
	//This is a method with private access modifier.
	private void printDiagonally(){
		System.out.println("Will print diagonally.");
	}
	
	
	
	//Caller of private method for demo
	public static void main(String[] args){
		//instantiate PrintService
		PrintService printService = new PrintService();
		
		//These are the variables accessible in same class.
		printService.printerId = "0001";
		printService.printerName = "HP deskjet";
		printService.serialNo = 1234567890;
		printService.printerUrl = "192.168.1.1"; //Note: this variable is accessible in same class only.
		
		//These are the methods accessible in same class.
		printService.printAll();
		printService.printVertical();
		printService.printHorizontally();
		printService.printDiagonally();//Note: this method is accessible in same class only.
	}
}
