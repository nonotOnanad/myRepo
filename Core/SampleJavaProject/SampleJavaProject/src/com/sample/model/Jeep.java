package com.sample.model;
/**
 * Subclass of Child class of Vehicle
 * @author monanad
 *
 */
public class Jeep extends Vehicle {
	//this is a unique attribute of Jeep amongst other vehicle.
	private String route;
	
	public void crash(){
		System.out.println("Jeep will crash.");
	}

	//Constructors
	public Jeep() {}

	public Jeep(String route) {
		this.route = route;
	}

	//Getters/Setters
	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}
	
//	public void run(){
//		System.out.println("Jeep will run.");
//	}
}
