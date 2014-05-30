package com.sample.service;
/**
 * Runner or class that will utilize PrintService in the same package.
 * @author monanad
 *
 */
public class RunnerSamePackage {

	public static void main(String[] args) {
		//instantiate PrintService
		PrintService printService = new PrintService();
		
		//These are the variables accessible in same class.
		printService.printerId = "0001";
		printService.printerName = "HP deskjet";
		printService.serialNo = 1234567890;
		//printService.printerUrl = "192.168.1.1"; 
		
		//These are the methods accessible in same class.
		printService.printAll();
		printService.printVertical();
		printService.printHorizontally();
		//printService.printDiagonally();
	}

}
