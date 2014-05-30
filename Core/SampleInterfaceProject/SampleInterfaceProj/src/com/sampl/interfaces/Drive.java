package com.sampl.interfaces;
/**
 * This is an example of an Interface class.
 * It can contain instance/static variables, constants and method declarations only.
 * 
 * @author monanad
 *
 */
public interface Drive extends RaceDrive{
	//instance variable
	public String allowedVehicle = "Car";
	//static variable
	public static int counter = 100;
	//a constant
	public static final String versionId = "000001";
	
	//method declarations with no implementation.
	public void run();
	public void accelerate();
	public void stop();
	public void brake();
}
