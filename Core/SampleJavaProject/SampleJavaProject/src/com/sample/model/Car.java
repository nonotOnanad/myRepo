package com.sample.model;
/**
 * Subclass of Child class of Vehicle
 * @author monanad
 *
 */
public class Car extends Vehicle {
	
	private String parkingNo;
	
	public void switchToDragRaceMode(){
		System.out.println("Car will switch to drag race mode.");
	}
	
	//Constructors	
	public Car() {}

	public Car(String parkingNo) {
		this.parkingNo = parkingNo;
	}

	//Getters/Setters
	public String getParkingNo() {
		return parkingNo;
	}

	public void setParkingNo(String parkingNo) {
		this.parkingNo = parkingNo;
	}

}
