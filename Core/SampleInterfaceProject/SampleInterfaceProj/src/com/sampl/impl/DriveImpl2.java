package com.sampl.impl;

import com.sampl.interfaces.Drive;

public class DriveImpl2 implements Drive {

	public void run() {
		System.out.println("Second Impl: Car will run.");
	}

	public void accelerate() {
		System.out.println("Second Impl: Car will accelerate.");
	}

	public void stop() {
		System.out.println("Second Impl: Car will stop.");
	}

	public void brake() {
		System.out.println("Second Impl: Car will brake.");
	}

	public void activeNitro() {
		System.out.println("Second Impl: Activate Nitro drive.");
	}

}
