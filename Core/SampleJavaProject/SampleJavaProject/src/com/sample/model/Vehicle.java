package com.sample.model;
/**
 * Parent Class of Jeep and Car.
 * @author monanad
 *
 */
public class Vehicle {
	
	private String name;
	private String type;
	private String modelNo;
	private int speed;
	
	private static int count = 2;
	
	public Vehicle() {}
	
	public Vehicle(String name, String type, String modelNo, int speed) {
		this.name = name;
		this.type = type;
		this.modelNo = modelNo;
		this.speed = speed;
	}

	public Vehicle(String type, String modelNo, int speed) {
		this.type = type;
		this.modelNo = modelNo;
		this.speed = speed;
	}

	public void run(){
		System.out.println("vehicle will run.");
	}
	
	public void accelerate(){
		System.out.println("vehicle will accelerate.");
	}
	
	public void honkHorn(){
		System.out.println("vehicle will honk horn.");
	}
	
	//Getters/Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
