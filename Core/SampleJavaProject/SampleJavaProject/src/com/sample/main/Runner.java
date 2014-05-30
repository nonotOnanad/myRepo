package com.sample.main;

import com.sample.model.Car;
import com.sample.model.Jeep;
import com.sample.model.Vehicle;

public class Runner {

	private final static String CAR = "Car";
	private static final String JEEP = "Jeep";

	public static void main(String[] args) {
		//Instantiate Vehicle class.
		Vehicle vehicle = new Vehicle();
		
		//state of Vehicle class.
		vehicle.setName("Parent Vehicle");
		vehicle.setModelNo("00001");
		vehicle.setSpeed(100);
		vehicle.setType("generic vehicle");
		
		Print print = new Print();
		print.printVehicle(vehicle);
		
		//Instantiate Subclass Jeep
		Jeep jeep = new Jeep();
		//state of Jeep class.
		jeep.setName("Sarao Jeep");
		jeep.setModelNo("00002");
		jeep.setSpeed(100);
		jeep.setType(JEEP);
		jeep.setRoute("FTI-Guadalupe");
		
		print.printVehicle(jeep);
		
		//Instantiate Subclass Car
		Car car = new Car();
		//state of Car class.
		car.setName("Honda");
		car.setModelNo("00003");
		car.setSpeed(100);
		car.setType(CAR);
		car.setParkingNo("park0001");

		print.printVehicle(car);
	}

}
