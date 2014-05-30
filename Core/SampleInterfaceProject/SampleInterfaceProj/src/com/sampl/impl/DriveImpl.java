package com.sampl.impl;

import com.sampl.interfaces.Drive;
/**
 * This is the Implementation class of interface Drive.
 * @author monanad
 *
 */
public class DriveImpl implements Drive {
	
	public void run() {
		System.out.println("Car will run.");
	}

	public void accelerate() {
		System.out.println("Car will accelerate.");
	}

	public void stop() {
		System.out.println("Car will stop.");
	}

	public void brake() {
		System.out.println("Car will brake.");
	}

	public void activeNitro() {
		System.out.println("Activate Nitro drive.");
	}

}
