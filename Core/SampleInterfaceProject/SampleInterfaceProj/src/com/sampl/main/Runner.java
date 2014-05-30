package com.sampl.main;

import com.sampl.impl.DriveImpl;
import com.sampl.impl.DriveImpl2;
import com.sampl.interfaces.Drive;

public class Runner {

	public static void main(String[] args) {
		//Instantiate interface.
		Drive drive = new DriveImpl();
		
		//now we can call the methods
		drive.accelerate();
		drive.brake();
		drive.run();
		drive.stop();
		
		//calling the extended method from RaceDrive.
		drive.activeNitro();
		
		//will create drive2 using another Implementation.
		Drive drive2 = new DriveImpl2();
		
		System.out.println("\n====another implementation====");
		//now we can call the methods
		drive2.accelerate();
		drive2.brake();
		drive2.run();
		drive2.stop();
		
		//calling the extended method from RaceDrive.
		drive2.activeNitro();
	}

}
