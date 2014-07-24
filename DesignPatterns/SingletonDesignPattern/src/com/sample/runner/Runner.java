package com.sample.runner;

import com.sample.singleton.SingletonObject;

public class Runner {

	public static void main(String[] args) {
		//Get the only object available
		SingletonObject object1 = SingletonObject.getInstance();
		
		System.out.println("Object1 id : "+object1);
		object1.showMessage();
		
	
		SingletonObject object2 = SingletonObject.getInstance();
		
		System.out.println("Object2 id : "+object2);
		object2.showMessage();
		
		System.out.println("object1 == object2 : " + (object1.equals(object2)));
	}

}
