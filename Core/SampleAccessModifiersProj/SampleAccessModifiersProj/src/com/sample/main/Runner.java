package com.sample.main;

import com.sample.service.PrintService;
/**
 * Runner or class that will utilize PrintService in a different package.
 * @author monanad
 *
 */
public class Runner {

	public static void main(String[] args) {
		//Create instance object of class PrintService.
		PrintService printService = new PrintService();
		
		//These are the variables accessible in same class.
		//printService.printerId = "0001";
		printService.printerName = "HP deskjet";
		//printService.serialNo = 1234567890;
		//printService.printerUrl = "192.168.1.1";
		
		//These are the accessible methods in PrintService at different package.
		//printService.printAll();
		printService.printVertical();
		//printService.printHorizontally();
		//printService.printDiagonally();
	}

}
