package com.sample.singleton;

public class SingletonObject {
	
	//create an object of SingleObject
	private static SingletonObject instance = new SingletonObject();
	
	//make constructor private
	private SingletonObject(){};
	
	//public method to return single instance.
	public static SingletonObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello World!");
	}
}
