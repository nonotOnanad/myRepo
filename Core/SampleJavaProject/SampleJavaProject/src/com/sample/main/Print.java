package com.sample.main;

import com.sample.model.Car;
import com.sample.model.Jeep;
import com.sample.model.Vehicle;

public class Print {
	
	public void printVehicle(Vehicle vehicle){
		System.out.println("\n Will print "+vehicle.getType());

		System.out.println("Vehicle Type: "+vehicle.getType());
		System.out.println("Vehicle Name: "+vehicle.getName());
		System.out.println("Model No: "+vehicle.getModelNo());
		System.out.println("Speed: "+vehicle.getSpeed());
		//common behaviors
		vehicle.accelerate();
		vehicle.run();
		vehicle.honkHorn();

		if(vehicle instanceof Jeep && vehicle != null){
			Jeep castedJeep = (Jeep) vehicle;
			System.out.println("Route: "+castedJeep.getRoute());
			//behaviors of Jeep class.
			castedJeep.crash();
		}else if(vehicle instanceof Car){
			Car castedCar = (Car) vehicle;
			System.out.println("Parking No.: "+castedCar.getParkingNo());
			//behaviors of Car class.
			castedCar.switchToDragRaceMode();
		}else{
			//Do logic
		}
	}
}
